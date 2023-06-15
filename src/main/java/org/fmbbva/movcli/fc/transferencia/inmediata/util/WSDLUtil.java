package org.fmbbva.movcli.fc.transferencia.inmediata.util;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.tempuri.action.WsBTRecepcionTINExecuteResponse;



public class WSDLUtil {
	
	public static JSONObject convertResponseWSDLtoString(WsBTRecepcionTINExecuteResponse response, String key) {

		try {
		
		JSONObject xmlJSONObj = XML.toJSONObject(response.getPayload());

		String jsonPrettyPrintString = xmlJSONObj.toString(4);
		System.out.println(jsonPrettyPrintString);

		} catch (JSONException e) {
		    System.out.println(e.toString());
		}

		return  null;
	}

}
