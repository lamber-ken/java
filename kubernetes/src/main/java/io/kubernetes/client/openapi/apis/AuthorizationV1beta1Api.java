/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.apis;

import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.openapi.ApiCallback;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.Pair;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1beta1LocalSubjectAccessReview;
import io.kubernetes.client.openapi.models.V1beta1SelfSubjectAccessReview;
import io.kubernetes.client.openapi.models.V1beta1SelfSubjectRulesReview;
import io.kubernetes.client.openapi.models.V1beta1SubjectAccessReview;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorizationV1beta1Api {
  private ApiClient localVarApiClient;

  public AuthorizationV1beta1Api() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthorizationV1beta1Api(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for createNamespacedLocalSubjectAccessReview
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createNamespacedLocalSubjectAccessReviewCall(
      String namespace,
      V1beta1LocalSubjectAccessReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/authorization.k8s.io/v1beta1/namespaces/{namespace}/localsubjectaccessreviews"
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call createNamespacedLocalSubjectAccessReviewValidateBeforeCall(
      String namespace,
      V1beta1LocalSubjectAccessReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling createNamespacedLocalSubjectAccessReview(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createNamespacedLocalSubjectAccessReview(Async)");
    }

    okhttp3.Call localVarCall =
        createNamespacedLocalSubjectAccessReviewCall(
            namespace, body, dryRun, fieldManager, pretty, _callback);
    return localVarCall;
  }

  /**
   * create a LocalSubjectAccessReview
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta1LocalSubjectAccessReview
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1LocalSubjectAccessReview createNamespacedLocalSubjectAccessReview(
      String namespace,
      V1beta1LocalSubjectAccessReview body,
      String dryRun,
      String fieldManager,
      String pretty)
      throws ApiException {
    ApiResponse<V1beta1LocalSubjectAccessReview> localVarResp =
        createNamespacedLocalSubjectAccessReviewWithHttpInfo(
            namespace, body, dryRun, fieldManager, pretty);
    return localVarResp.getData();
  }

  /**
   * create a LocalSubjectAccessReview
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta1LocalSubjectAccessReview&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1LocalSubjectAccessReview>
      createNamespacedLocalSubjectAccessReviewWithHttpInfo(
          String namespace,
          V1beta1LocalSubjectAccessReview body,
          String dryRun,
          String fieldManager,
          String pretty)
          throws ApiException {
    okhttp3.Call localVarCall =
        createNamespacedLocalSubjectAccessReviewValidateBeforeCall(
            namespace, body, dryRun, fieldManager, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta1LocalSubjectAccessReview>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) create a LocalSubjectAccessReview
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createNamespacedLocalSubjectAccessReviewAsync(
      String namespace,
      V1beta1LocalSubjectAccessReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback<V1beta1LocalSubjectAccessReview> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createNamespacedLocalSubjectAccessReviewValidateBeforeCall(
            namespace, body, dryRun, fieldManager, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta1LocalSubjectAccessReview>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for createSelfSubjectAccessReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createSelfSubjectAccessReviewCall(
      V1beta1SelfSubjectAccessReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/authorization.k8s.io/v1beta1/selfsubjectaccessreviews";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call createSelfSubjectAccessReviewValidateBeforeCall(
      V1beta1SelfSubjectAccessReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createSelfSubjectAccessReview(Async)");
    }

    okhttp3.Call localVarCall =
        createSelfSubjectAccessReviewCall(body, dryRun, fieldManager, pretty, _callback);
    return localVarCall;
  }

  /**
   * create a SelfSubjectAccessReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta1SelfSubjectAccessReview
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1SelfSubjectAccessReview createSelfSubjectAccessReview(
      V1beta1SelfSubjectAccessReview body, String dryRun, String fieldManager, String pretty)
      throws ApiException {
    ApiResponse<V1beta1SelfSubjectAccessReview> localVarResp =
        createSelfSubjectAccessReviewWithHttpInfo(body, dryRun, fieldManager, pretty);
    return localVarResp.getData();
  }

  /**
   * create a SelfSubjectAccessReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta1SelfSubjectAccessReview&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1SelfSubjectAccessReview> createSelfSubjectAccessReviewWithHttpInfo(
      V1beta1SelfSubjectAccessReview body, String dryRun, String fieldManager, String pretty)
      throws ApiException {
    okhttp3.Call localVarCall =
        createSelfSubjectAccessReviewValidateBeforeCall(body, dryRun, fieldManager, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta1SelfSubjectAccessReview>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) create a SelfSubjectAccessReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createSelfSubjectAccessReviewAsync(
      V1beta1SelfSubjectAccessReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback<V1beta1SelfSubjectAccessReview> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createSelfSubjectAccessReviewValidateBeforeCall(
            body, dryRun, fieldManager, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta1SelfSubjectAccessReview>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for createSelfSubjectRulesReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createSelfSubjectRulesReviewCall(
      V1beta1SelfSubjectRulesReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/authorization.k8s.io/v1beta1/selfsubjectrulesreviews";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call createSelfSubjectRulesReviewValidateBeforeCall(
      V1beta1SelfSubjectRulesReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createSelfSubjectRulesReview(Async)");
    }

    okhttp3.Call localVarCall =
        createSelfSubjectRulesReviewCall(body, dryRun, fieldManager, pretty, _callback);
    return localVarCall;
  }

  /**
   * create a SelfSubjectRulesReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta1SelfSubjectRulesReview
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1SelfSubjectRulesReview createSelfSubjectRulesReview(
      V1beta1SelfSubjectRulesReview body, String dryRun, String fieldManager, String pretty)
      throws ApiException {
    ApiResponse<V1beta1SelfSubjectRulesReview> localVarResp =
        createSelfSubjectRulesReviewWithHttpInfo(body, dryRun, fieldManager, pretty);
    return localVarResp.getData();
  }

  /**
   * create a SelfSubjectRulesReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta1SelfSubjectRulesReview&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1SelfSubjectRulesReview> createSelfSubjectRulesReviewWithHttpInfo(
      V1beta1SelfSubjectRulesReview body, String dryRun, String fieldManager, String pretty)
      throws ApiException {
    okhttp3.Call localVarCall =
        createSelfSubjectRulesReviewValidateBeforeCall(body, dryRun, fieldManager, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta1SelfSubjectRulesReview>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) create a SelfSubjectRulesReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createSelfSubjectRulesReviewAsync(
      V1beta1SelfSubjectRulesReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback<V1beta1SelfSubjectRulesReview> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createSelfSubjectRulesReviewValidateBeforeCall(
            body, dryRun, fieldManager, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta1SelfSubjectRulesReview>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for createSubjectAccessReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createSubjectAccessReviewCall(
      V1beta1SubjectAccessReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/authorization.k8s.io/v1beta1/subjectaccessreviews";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call createSubjectAccessReviewValidateBeforeCall(
      V1beta1SubjectAccessReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createSubjectAccessReview(Async)");
    }

    okhttp3.Call localVarCall =
        createSubjectAccessReviewCall(body, dryRun, fieldManager, pretty, _callback);
    return localVarCall;
  }

  /**
   * create a SubjectAccessReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta1SubjectAccessReview
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1SubjectAccessReview createSubjectAccessReview(
      V1beta1SubjectAccessReview body, String dryRun, String fieldManager, String pretty)
      throws ApiException {
    ApiResponse<V1beta1SubjectAccessReview> localVarResp =
        createSubjectAccessReviewWithHttpInfo(body, dryRun, fieldManager, pretty);
    return localVarResp.getData();
  }

  /**
   * create a SubjectAccessReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta1SubjectAccessReview&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1SubjectAccessReview> createSubjectAccessReviewWithHttpInfo(
      V1beta1SubjectAccessReview body, String dryRun, String fieldManager, String pretty)
      throws ApiException {
    okhttp3.Call localVarCall =
        createSubjectAccessReviewValidateBeforeCall(body, dryRun, fieldManager, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta1SubjectAccessReview>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) create a SubjectAccessReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createSubjectAccessReviewAsync(
      V1beta1SubjectAccessReview body,
      String dryRun,
      String fieldManager,
      String pretty,
      final ApiCallback<V1beta1SubjectAccessReview> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createSubjectAccessReviewValidateBeforeCall(body, dryRun, fieldManager, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta1SubjectAccessReview>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getAPIResources
   *
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getAPIResourcesCall(final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/apis/authorization.k8s.io/v1beta1/";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call getAPIResourcesValidateBeforeCall(final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall = getAPIResourcesCall(_callback);
    return localVarCall;
  }

  /**
   * get available resources
   *
   * @return V1APIResourceList
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1APIResourceList getAPIResources() throws ApiException {
    ApiResponse<V1APIResourceList> localVarResp = getAPIResourcesWithHttpInfo();
    return localVarResp.getData();
  }

  /**
   * get available resources
   *
   * @return ApiResponse&lt;V1APIResourceList&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1APIResourceList> getAPIResourcesWithHttpInfo() throws ApiException {
    okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(null);
    Type localVarReturnType = new TypeToken<V1APIResourceList>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) get available resources
   *
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getAPIResourcesAsync(final ApiCallback<V1APIResourceList> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(_callback);
    Type localVarReturnType = new TypeToken<V1APIResourceList>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
