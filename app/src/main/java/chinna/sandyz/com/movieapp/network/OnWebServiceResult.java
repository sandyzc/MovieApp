package chinna.sandyz.com.movieapp.network;


import chinna.sandyz.com.movieapp.utils.CommonUtilities;

/**
 * @author Preetika
 *
 */
public interface OnWebServiceResult {
	public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}
