/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.15.3
 * Contact: vrchatapi.lpv0t@aries.fyi
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.api;

import io.github.vrchatapi.ApiCallback;
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.ApiResponse;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.Pair;
import io.github.vrchatapi.ProgressRequestBody;
import io.github.vrchatapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.github.vrchatapi.model.Error;
import io.github.vrchatapi.model.Permission;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PermissionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PermissionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PermissionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getAssignedPermissions
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Permission objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAssignedPermissionsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/auth/permissions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "authCookie" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAssignedPermissionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getAssignedPermissionsCall(_callback);

    }

    /**
     * Get Assigned Permissions
     * Returns a list of all permissions currently granted by the user. Permissions are assigned e.g. by subscribing to VRC+.
     * @return List&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Permission objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public List<Permission> getAssignedPermissions() throws ApiException {
        ApiResponse<List<Permission>> localVarResp = getAssignedPermissionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Assigned Permissions
     * Returns a list of all permissions currently granted by the user. Permissions are assigned e.g. by subscribing to VRC+.
     * @return ApiResponse&lt;List&lt;Permission&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Permission objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Permission>> getAssignedPermissionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAssignedPermissionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Assigned Permissions (asynchronously)
     * Returns a list of all permissions currently granted by the user. Permissions are assigned e.g. by subscribing to VRC+.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of Permission objects. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAssignedPermissionsAsync(final ApiCallback<List<Permission>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAssignedPermissionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPermission
     * @param permissionId Must be a valid permission ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Permission object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPermissionCall(String permissionId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/permissions/{permissionId}"
            .replace("{" + "permissionId" + "}", localVarApiClient.escapeString(permissionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "authCookie" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPermissionValidateBeforeCall(String permissionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'permissionId' is set
        if (permissionId == null) {
            throw new ApiException("Missing the required parameter 'permissionId' when calling getPermission(Async)");
        }

        return getPermissionCall(permissionId, _callback);

    }

    /**
     * Get Permission
     * Returns a single permission. This endpoint is pretty useless, as it returns the exact same information as &#x60;/auth/permissions&#x60;.
     * @param permissionId Must be a valid permission ID. (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Permission object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Permission getPermission(String permissionId) throws ApiException {
        ApiResponse<Permission> localVarResp = getPermissionWithHttpInfo(permissionId);
        return localVarResp.getData();
    }

    /**
     * Get Permission
     * Returns a single permission. This endpoint is pretty useless, as it returns the exact same information as &#x60;/auth/permissions&#x60;.
     * @param permissionId Must be a valid permission ID. (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Permission object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Permission> getPermissionWithHttpInfo(String permissionId) throws ApiException {
        okhttp3.Call localVarCall = getPermissionValidateBeforeCall(permissionId, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Permission (asynchronously)
     * Returns a single permission. This endpoint is pretty useless, as it returns the exact same information as &#x60;/auth/permissions&#x60;.
     * @param permissionId Must be a valid permission ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Permission object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPermissionAsync(String permissionId, final ApiCallback<Permission> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPermissionValidateBeforeCall(permissionId, _callback);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
