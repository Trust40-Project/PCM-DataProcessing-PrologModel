package correctness;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.text.StringSubstitutor;

import interpreters.QueryResult;
import interpreters.UnificationResult;
import interpreters.VariableMappingResult;

public class QueryResultChecks {
	
	public static String ACCESSCONTROL_QUERY = "unauthorizedAccess(S,P)";
	
	public static String ACCESSCONTROL_VARREPLACEMENT = "unauthorizedAccess(%S%,%P%)";
	
	public static String ACCESSCONTROL_NODECLASSIFY_REGEX = "unauthorizedAccess\\(\\Q['Airline_bookFlight',\\E(.*)'?book'?\\Q,'TravelPlanner_bookFlight'\\E(.*)\\],'?ccd'?\\)";
	public static String ACCESSCONTROL_NOTIFYAGENCY_REGEX = "unauthorizedAccess\\(\\Q['TravelAgency_notifyAboutBooking',\\E(.*)'?notifyAgency'?\\Q,'TravelPlanner_bookFlight'\\E(.*)\\Q,'BookingUsage'\\E(.*)\\],'?selectedOffer'?\\)";

	public static String GEOLOCATIION_QUERY = "anyViolation(S1,P1,S2,P2,L)";
	
	public static String GEOLOCATIION_VARREPLACEMENT = "anyViolation(%S1%,%P1%,%S2%,%P2%,%L%)";
	
	public static String GEOLOCATIION_TYPE0_REGEX = "anyViolation\\(\\Q['UserDB_store'\\E(.*)\\],'?customer'?,(.*),(.*),'US'\\)";
	public static String GEOLOCATIION_TYPE1_A_REGEX = "anyViolation\\(\\['LogDB_store',(.*)'ShopServer_view'(.*)\\],'?log'?,\\['RecommendationSystem_update',(.*),'ShopServer_buy'(.*)\\],'?order'?,'Asia'\\)";
	public static String GEOLOCATIION_TYPE1_B_REGEX = "anyViolation\\(\\['LogDB_store',(.*)'ShopServer_buy'(.*)\\],'?log'?,\\['RecommendationSystem_update',(.*),'ShopServer_buy'(.*)\\],'?order'?,'Asia'\\)";
	
	
	public static boolean hasCCDNoDeclassifyViolation(QueryResult res) {
		return checkForRegexMatch(res,ACCESSCONTROL_VARREPLACEMENT, ACCESSCONTROL_NODECLASSIFY_REGEX);
	}
	
	public static boolean hasNotifyAgencyViolation(QueryResult res) {
		return checkForRegexMatch(res,ACCESSCONTROL_VARREPLACEMENT, ACCESSCONTROL_NOTIFYAGENCY_REGEX);
	}
	
	public static boolean hasType0GeoViolation(QueryResult res) {
		return checkForRegexMatch(res,GEOLOCATIION_VARREPLACEMENT, GEOLOCATIION_TYPE0_REGEX);
	}
	
	public static boolean hasType1GeoViolationA(QueryResult res) {
		return checkForRegexMatch(res,GEOLOCATIION_VARREPLACEMENT, GEOLOCATIION_TYPE1_A_REGEX);
	}
	
	public static boolean hasType1GeoViolationB(QueryResult res) {
		return checkForRegexMatch(res,GEOLOCATIION_VARREPLACEMENT, GEOLOCATIION_TYPE1_B_REGEX);
	}

	private static List<String> getResultsAsUnification(String varReplacement, QueryResult res) {
		if(res instanceof UnificationResult) {
			return ((UnificationResult) res).getSolutions();
		} else if (res instanceof VariableMappingResult) {
			return ((VariableMappingResult) res).getSolutions().stream()
			.map(vars -> StringSubstitutor.replace(varReplacement, vars, "%", "%"))
			.collect(Collectors.toList());
		} else {
			throw new RuntimeException("Unexpected Result Type");
		}
	}
	
	private static boolean checkForRegexMatch(QueryResult res, String varReplacement, String regex) {
		for(String unif : getResultsAsUnification(varReplacement, res)) {
			if(Pattern.matches(regex, unif)) {
				return true;
			}
		}
		return false;
	}
}
