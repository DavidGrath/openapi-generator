package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class FakeClassnameTags123Api {
  private ApiClient apiClient;

  public FakeClassnameTags123Api() {
    this(Configuration.getDefaultApiClient());
  }

  public FakeClassnameTags123Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * To test class name in snake case
   * To test class name in snake case
   * @param body client model (required)
   * @return Client
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public Client testClassname(@javax.annotation.Nonnull Client body) throws ApiException {
    return testClassnameWithHttpInfo(body).getData();
  }

  /**
   * To test class name in snake case
   * To test class name in snake case
   * @param body client model (required)
   * @return ApiResponse&lt;Client&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Client> testClassnameWithHttpInfo(@javax.annotation.Nonnull Client body) throws ApiException {
    // Check required parameters
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testClassname");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"api_key_query"};
    GenericType<Client> localVarReturnType = new GenericType<Client>() {};
    return apiClient.invokeAPI("FakeClassnameTags123Api.testClassname", "/fake_classname_test", "PATCH", new ArrayList<>(), body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
