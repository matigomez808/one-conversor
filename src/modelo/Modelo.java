package modelo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.*;


public class Modelo {

	private int montoConvertir;
	private float resultadoConversion;
	private String monedaPrimaria;
	private String monedaSecundaria;
	private Conversion c;
	private ApiKey a = new ApiKey();
	private String apiKey = a.getApiKey();
	
	public float getResultadoConversion() {
		return resultadoConversion;
	}
	public void setResultadoConversion(float resultadoConversion) {
		this.resultadoConversion = resultadoConversion;
	}
	public int getMontoConvertir() {
		return montoConvertir;
	}
	public void setMontoConvertir(int montoConvertir) {
		this.montoConvertir = montoConvertir;
	}
	public String getMonedaPrimaria() {
		return monedaPrimaria;
	}
	public void setMonedaPrimaria(String monedaPrimaria) {
		this.monedaPrimaria = monedaPrimaria;
	}
	public String getMonedaSecundaria() {
		return monedaSecundaria;
	}
	public void setMonedaSecundaria(String monedaSecundaria) {
		this.monedaSecundaria = monedaSecundaria;
	}
	
	
	public void convertir() throws IOException, InterruptedException {
//		Conversion c;
		Gson gson = new Gson();
		
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://api.apilayer.com/exchangerates_data/convert?to=" + monedaSecundaria + "&from=" + monedaPrimaria + "&amount=" + montoConvertir))
				.header("apikey", apiKey)
			    .build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		   System.out.println(response.statusCode());
		   System.out.println(response.body());
		   
		c = gson.fromJson(response.body(), Conversion.class);
		
		float res = Float.parseFloat(c.getResult());
		
		System.out.println(c.getResult());
		
		setResultadoConversion(res);
		
	}
	
	
	
	
	/* 
	HttpClient client = HttpClient.newHttpClient();
	HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create("https://api.apilayer.com/exchangerates_data/convert?to=" + this.monedaPrimaria + "&from=" + this.monedaSecundaria + "&amount=" + this.montoConvertir))
			.header("apikey", "29u5LuwaVGdxNgJg39wQui5zG1vgnGRV")
		    .build();
	HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
	   System.out.println(response.statusCode());
	   System.out.println(response.body());
	
	*/
	
	
}
	
	

