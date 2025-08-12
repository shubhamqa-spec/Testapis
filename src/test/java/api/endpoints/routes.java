package api.endpoints;



public class routes {
	
	public static String base_url="https://petstore.swagger.io/v2" ;
	
	public static String post_url= base_url +"/user";
	public static String get_url= base_url +"/user/{username}";
	public static String update_url= base_url +"/user/{username}";
	public static String delete_url= base_url +"/user/{username}";
	
	public static String login_url  = base_url + "/user/login";
	public static String logout_url = base_url + "/user/logout";
	
	public static String get_store_url= base_url +"/store/inventory";
	public static String post_store_url= base_url +"/store/order";	
	
	public static String get_pet_url= base_url +"/pet/2";
	public static String post_pet_url= base_url +"/pet/2";

}


