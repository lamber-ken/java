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
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiCallback;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.Pair;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1DeleteOptions;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinition;
import io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionList;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiextensionsV1beta1Api {
  private ApiClient localVarApiClient;

  public ApiextensionsV1beta1Api() {
    this(Configuration.getDefaultApiClient());
  }

  public ApiextensionsV1beta1Api(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for createCustomResourceDefinition
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call createCustomResourceDefinitionCall(
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
  private okhttp3.Call createCustomResourceDefinitionValidateBeforeCall(
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createCustomResourceDefinition(Async)");
    }

    okhttp3.Call localVarCall =
        createCustomResourceDefinitionCall(body, pretty, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * create a CustomResourceDefinition
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return V1beta1CustomResourceDefinition
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
  public V1beta1CustomResourceDefinition createCustomResourceDefinition(
      V1beta1CustomResourceDefinition body, String pretty, String dryRun, String fieldManager)
      throws ApiException {
    ApiResponse<V1beta1CustomResourceDefinition> localVarResp =
        createCustomResourceDefinitionWithHttpInfo(body, pretty, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * create a CustomResourceDefinition
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return ApiResponse&lt;V1beta1CustomResourceDefinition&gt;
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
  public ApiResponse<V1beta1CustomResourceDefinition> createCustomResourceDefinitionWithHttpInfo(
      V1beta1CustomResourceDefinition body, String pretty, String dryRun, String fieldManager)
      throws ApiException {
    okhttp3.Call localVarCall =
        createCustomResourceDefinitionValidateBeforeCall(body, pretty, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) create a CustomResourceDefinition
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call createCustomResourceDefinitionAsync(
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback<V1beta1CustomResourceDefinition> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createCustomResourceDefinitionValidateBeforeCall(
            body, pretty, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteCollectionCustomResourceDefinition
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
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
  public okhttp3.Call deleteCollectionCustomResourceDefinitionCall(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (_continue != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
    }

    if (gracePeriodSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
    }

    if (labelSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (orphanDependents != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
    }

    if (propagationPolicy != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
    }

    if (resourceVersion != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
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
        "DELETE",
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
  private okhttp3.Call deleteCollectionCustomResourceDefinitionValidateBeforeCall(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionCustomResourceDefinitionCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            timeoutSeconds,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * delete collection of CustomResourceDefinition
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @return V1Status
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1Status deleteCollectionCustomResourceDefinition(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      Integer timeoutSeconds,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<V1Status> localVarResp =
        deleteCollectionCustomResourceDefinitionWithHttpInfo(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            timeoutSeconds,
            body);
    return localVarResp.getData();
  }

  /**
   * delete collection of CustomResourceDefinition
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @return ApiResponse&lt;V1Status&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1Status> deleteCollectionCustomResourceDefinitionWithHttpInfo(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      Integer timeoutSeconds,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteCollectionCustomResourceDefinitionValidateBeforeCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            timeoutSeconds,
            body,
            null);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) delete collection of CustomResourceDefinition
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
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
  public okhttp3.Call deleteCollectionCustomResourceDefinitionAsync(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback<V1Status> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionCustomResourceDefinitionValidateBeforeCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            timeoutSeconds,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteCustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteCustomResourceDefinitionCall(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (gracePeriodSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
    }

    if (orphanDependents != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
    }

    if (propagationPolicy != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
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
        "DELETE",
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
  private okhttp3.Call deleteCustomResourceDefinitionValidateBeforeCall(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling deleteCustomResourceDefinition(Async)");
    }

    okhttp3.Call localVarCall =
        deleteCustomResourceDefinitionCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * delete a CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @return V1Status
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1Status deleteCustomResourceDefinition(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<V1Status> localVarResp =
        deleteCustomResourceDefinitionWithHttpInfo(
            name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);
    return localVarResp.getData();
  }

  /**
   * delete a CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @return ApiResponse&lt;V1Status&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1Status> deleteCustomResourceDefinitionWithHttpInfo(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteCustomResourceDefinitionValidateBeforeCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            null);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) delete a CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteCustomResourceDefinitionAsync(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback<V1Status> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCustomResourceDefinitionValidateBeforeCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
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
    String localVarPath = "/apis/apiextensions.k8s.io/v1beta1/";

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
  /**
   * Build call for listCustomResourceDefinition
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
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
  public okhttp3.Call listCustomResourceDefinitionCall(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (allowWatchBookmarks != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("allowWatchBookmarks", allowWatchBookmarks));
    }

    if (_continue != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
    }

    if (fieldSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
    }

    if (labelSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (resourceVersion != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
    }

    if (watch != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json",
      "application/yaml",
      "application/vnd.kubernetes.protobuf",
      "application/json;stream=watch",
      "application/vnd.kubernetes.protobuf;stream=watch"
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
  private okhttp3.Call listCustomResourceDefinitionValidateBeforeCall(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listCustomResourceDefinitionCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            timeoutSeconds,
            watch,
            _callback);
    return localVarCall;
  }

  /**
   * list or watch objects of kind CustomResourceDefinition
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return V1beta1CustomResourceDefinitionList
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1CustomResourceDefinitionList listCustomResourceDefinition(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      Integer timeoutSeconds,
      Boolean watch)
      throws ApiException {
    ApiResponse<V1beta1CustomResourceDefinitionList> localVarResp =
        listCustomResourceDefinitionWithHttpInfo(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            timeoutSeconds,
            watch);
    return localVarResp.getData();
  }

  /**
   * list or watch objects of kind CustomResourceDefinition
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return ApiResponse&lt;V1beta1CustomResourceDefinitionList&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1CustomResourceDefinitionList> listCustomResourceDefinitionWithHttpInfo(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      Integer timeoutSeconds,
      Boolean watch)
      throws ApiException {
    okhttp3.Call localVarCall =
        listCustomResourceDefinitionValidateBeforeCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            timeoutSeconds,
            watch,
            null);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinitionList>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) list or watch objects of kind CustomResourceDefinition
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
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
  public okhttp3.Call listCustomResourceDefinitionAsync(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback<V1beta1CustomResourceDefinitionList> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listCustomResourceDefinitionValidateBeforeCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            timeoutSeconds,
            watch,
            _callback);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinitionList>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchCustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
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
  public okhttp3.Call patchCustomResourceDefinitionCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
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

    final String[] localVarContentTypes = {
      "application/json-patch+json",
      "application/merge-patch+json",
      "application/strategic-merge-patch+json",
      "application/apply-patch+yaml"
    };
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PATCH",
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
  private okhttp3.Call patchCustomResourceDefinitionValidateBeforeCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchCustomResourceDefinition(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchCustomResourceDefinition(Async)");
    }

    okhttp3.Call localVarCall =
        patchCustomResourceDefinitionCall(
            name, body, pretty, dryRun, fieldManager, force, _callback);
    return localVarCall;
  }

  /**
   * partially update the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return V1beta1CustomResourceDefinition
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1CustomResourceDefinition patchCustomResourceDefinition(
      String name, V1Patch body, String pretty, String dryRun, String fieldManager, Boolean force)
      throws ApiException {
    ApiResponse<V1beta1CustomResourceDefinition> localVarResp =
        patchCustomResourceDefinitionWithHttpInfo(name, body, pretty, dryRun, fieldManager, force);
    return localVarResp.getData();
  }

  /**
   * partially update the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;V1beta1CustomResourceDefinition&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1CustomResourceDefinition> patchCustomResourceDefinitionWithHttpInfo(
      String name, V1Patch body, String pretty, String dryRun, String fieldManager, Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchCustomResourceDefinitionValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, force, null);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
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
  public okhttp3.Call patchCustomResourceDefinitionAsync(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback<V1beta1CustomResourceDefinition> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchCustomResourceDefinitionValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, force, _callback);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchCustomResourceDefinitionStatus
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
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
  public okhttp3.Call patchCustomResourceDefinitionStatusCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
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

    final String[] localVarContentTypes = {
      "application/json-patch+json",
      "application/merge-patch+json",
      "application/strategic-merge-patch+json",
      "application/apply-patch+yaml"
    };
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PATCH",
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
  private okhttp3.Call patchCustomResourceDefinitionStatusValidateBeforeCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchCustomResourceDefinitionStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchCustomResourceDefinitionStatus(Async)");
    }

    okhttp3.Call localVarCall =
        patchCustomResourceDefinitionStatusCall(
            name, body, pretty, dryRun, fieldManager, force, _callback);
    return localVarCall;
  }

  /**
   * partially update status of the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return V1beta1CustomResourceDefinition
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1CustomResourceDefinition patchCustomResourceDefinitionStatus(
      String name, V1Patch body, String pretty, String dryRun, String fieldManager, Boolean force)
      throws ApiException {
    ApiResponse<V1beta1CustomResourceDefinition> localVarResp =
        patchCustomResourceDefinitionStatusWithHttpInfo(
            name, body, pretty, dryRun, fieldManager, force);
    return localVarResp.getData();
  }

  /**
   * partially update status of the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;V1beta1CustomResourceDefinition&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1CustomResourceDefinition>
      patchCustomResourceDefinitionStatusWithHttpInfo(
          String name,
          V1Patch body,
          String pretty,
          String dryRun,
          String fieldManager,
          Boolean force)
          throws ApiException {
    okhttp3.Call localVarCall =
        patchCustomResourceDefinitionStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, force, null);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update status of the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
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
  public okhttp3.Call patchCustomResourceDefinitionStatusAsync(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback<V1beta1CustomResourceDefinition> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchCustomResourceDefinitionStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, force, _callback);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for readCustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param exact Should the export be exact. Exact export maintains cluster-specific fields like
   *     &#39;Namespace&#39;. Deprecated. Planned for removal in 1.18. (optional)
   * @param export Should this value be exported. Export strips fields that a user can not specify.
   *     Deprecated. Planned for removal in 1.18. (optional)
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
  public okhttp3.Call readCustomResourceDefinitionCall(
      String name, String pretty, Boolean exact, Boolean export, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (exact != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("exact", exact));
    }

    if (export != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("export", export));
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
  private okhttp3.Call readCustomResourceDefinitionValidateBeforeCall(
      String name, String pretty, Boolean exact, Boolean export, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling readCustomResourceDefinition(Async)");
    }

    okhttp3.Call localVarCall =
        readCustomResourceDefinitionCall(name, pretty, exact, export, _callback);
    return localVarCall;
  }

  /**
   * read the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param exact Should the export be exact. Exact export maintains cluster-specific fields like
   *     &#39;Namespace&#39;. Deprecated. Planned for removal in 1.18. (optional)
   * @param export Should this value be exported. Export strips fields that a user can not specify.
   *     Deprecated. Planned for removal in 1.18. (optional)
   * @return V1beta1CustomResourceDefinition
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1CustomResourceDefinition readCustomResourceDefinition(
      String name, String pretty, Boolean exact, Boolean export) throws ApiException {
    ApiResponse<V1beta1CustomResourceDefinition> localVarResp =
        readCustomResourceDefinitionWithHttpInfo(name, pretty, exact, export);
    return localVarResp.getData();
  }

  /**
   * read the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param exact Should the export be exact. Exact export maintains cluster-specific fields like
   *     &#39;Namespace&#39;. Deprecated. Planned for removal in 1.18. (optional)
   * @param export Should this value be exported. Export strips fields that a user can not specify.
   *     Deprecated. Planned for removal in 1.18. (optional)
   * @return ApiResponse&lt;V1beta1CustomResourceDefinition&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1CustomResourceDefinition> readCustomResourceDefinitionWithHttpInfo(
      String name, String pretty, Boolean exact, Boolean export) throws ApiException {
    okhttp3.Call localVarCall =
        readCustomResourceDefinitionValidateBeforeCall(name, pretty, exact, export, null);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param exact Should the export be exact. Exact export maintains cluster-specific fields like
   *     &#39;Namespace&#39;. Deprecated. Planned for removal in 1.18. (optional)
   * @param export Should this value be exported. Export strips fields that a user can not specify.
   *     Deprecated. Planned for removal in 1.18. (optional)
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
  public okhttp3.Call readCustomResourceDefinitionAsync(
      String name,
      String pretty,
      Boolean exact,
      Boolean export,
      final ApiCallback<V1beta1CustomResourceDefinition> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        readCustomResourceDefinitionValidateBeforeCall(name, pretty, exact, export, _callback);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for readCustomResourceDefinitionStatus
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
  public okhttp3.Call readCustomResourceDefinitionStatusCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
  private okhttp3.Call readCustomResourceDefinitionStatusValidateBeforeCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling readCustomResourceDefinitionStatus(Async)");
    }

    okhttp3.Call localVarCall = readCustomResourceDefinitionStatusCall(name, pretty, _callback);
    return localVarCall;
  }

  /**
   * read status of the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta1CustomResourceDefinition
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1CustomResourceDefinition readCustomResourceDefinitionStatus(
      String name, String pretty) throws ApiException {
    ApiResponse<V1beta1CustomResourceDefinition> localVarResp =
        readCustomResourceDefinitionStatusWithHttpInfo(name, pretty);
    return localVarResp.getData();
  }

  /**
   * read status of the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta1CustomResourceDefinition&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1CustomResourceDefinition>
      readCustomResourceDefinitionStatusWithHttpInfo(String name, String pretty)
          throws ApiException {
    okhttp3.Call localVarCall =
        readCustomResourceDefinitionStatusValidateBeforeCall(name, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read status of the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
  public okhttp3.Call readCustomResourceDefinitionStatusAsync(
      String name, String pretty, final ApiCallback<V1beta1CustomResourceDefinition> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        readCustomResourceDefinitionStatusValidateBeforeCall(name, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceCustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceCustomResourceDefinitionCall(
      String name,
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
        "PUT",
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
  private okhttp3.Call replaceCustomResourceDefinitionValidateBeforeCall(
      String name,
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceCustomResourceDefinition(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceCustomResourceDefinition(Async)");
    }

    okhttp3.Call localVarCall =
        replaceCustomResourceDefinitionCall(name, body, pretty, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * replace the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return V1beta1CustomResourceDefinition
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1CustomResourceDefinition replaceCustomResourceDefinition(
      String name,
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager)
      throws ApiException {
    ApiResponse<V1beta1CustomResourceDefinition> localVarResp =
        replaceCustomResourceDefinitionWithHttpInfo(name, body, pretty, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * replace the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return ApiResponse&lt;V1beta1CustomResourceDefinition&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1CustomResourceDefinition> replaceCustomResourceDefinitionWithHttpInfo(
      String name,
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager)
      throws ApiException {
    okhttp3.Call localVarCall =
        replaceCustomResourceDefinitionValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceCustomResourceDefinitionAsync(
      String name,
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback<V1beta1CustomResourceDefinition> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceCustomResourceDefinitionValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceCustomResourceDefinitionStatus
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceCustomResourceDefinitionStatusCall(
      String name,
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
        "PUT",
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
  private okhttp3.Call replaceCustomResourceDefinitionStatusValidateBeforeCall(
      String name,
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceCustomResourceDefinitionStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceCustomResourceDefinitionStatus(Async)");
    }

    okhttp3.Call localVarCall =
        replaceCustomResourceDefinitionStatusCall(
            name, body, pretty, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * replace status of the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return V1beta1CustomResourceDefinition
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1CustomResourceDefinition replaceCustomResourceDefinitionStatus(
      String name,
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager)
      throws ApiException {
    ApiResponse<V1beta1CustomResourceDefinition> localVarResp =
        replaceCustomResourceDefinitionStatusWithHttpInfo(name, body, pretty, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * replace status of the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return ApiResponse&lt;V1beta1CustomResourceDefinition&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1CustomResourceDefinition>
      replaceCustomResourceDefinitionStatusWithHttpInfo(
          String name,
          V1beta1CustomResourceDefinition body,
          String pretty,
          String dryRun,
          String fieldManager)
          throws ApiException {
    okhttp3.Call localVarCall =
        replaceCustomResourceDefinitionStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace status of the specified CustomResourceDefinition
   *
   * @param name name of the CustomResourceDefinition (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceCustomResourceDefinitionStatusAsync(
      String name,
      V1beta1CustomResourceDefinition body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback<V1beta1CustomResourceDefinition> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceCustomResourceDefinitionStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<V1beta1CustomResourceDefinition>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
