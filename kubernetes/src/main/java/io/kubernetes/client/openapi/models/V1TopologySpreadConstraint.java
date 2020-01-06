/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.16.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
 */
@ApiModel(description = "TopologySpreadConstraint specifies how to spread matching pods among the given topology.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-17T11:16:41.964Z[Etc/UTC]")
public class V1TopologySpreadConstraint {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1LabelSelector labelSelector;

  public static final String SERIALIZED_NAME_MAX_SKEW = "maxSkew";
  @SerializedName(SERIALIZED_NAME_MAX_SKEW)
  private Integer maxSkew;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;

  public static final String SERIALIZED_NAME_WHEN_UNSATISFIABLE = "whenUnsatisfiable";
  @SerializedName(SERIALIZED_NAME_WHEN_UNSATISFIABLE)
  private String whenUnsatisfiable;


  public V1TopologySpreadConstraint labelSelector(V1LabelSelector labelSelector) {
    
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1LabelSelector getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(V1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public V1TopologySpreadConstraint maxSkew(Integer maxSkew) {
    
    this.maxSkew = maxSkew;
    return this;
  }

   /**
   * MaxSkew describes the degree to which pods may be unevenly distributed. It&#39;s the maximum permitted difference between the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. It&#39;s a required field. Default value is 1 and 0 is not allowed.
   * @return maxSkew
  **/
  @ApiModelProperty(required = true, value = "MaxSkew describes the degree to which pods may be unevenly distributed. It's the maximum permitted difference between the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. It's a required field. Default value is 1 and 0 is not allowed.")

  public Integer getMaxSkew() {
    return maxSkew;
  }


  public void setMaxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
  }


  public V1TopologySpreadConstraint topologyKey(String topologyKey) {
    
    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a \&quot;bucket\&quot;, and try to put balanced number of pods into each bucket. It&#39;s a required field.
   * @return topologyKey
  **/
  @ApiModelProperty(required = true, value = "TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each <key, value> as a \"bucket\", and try to put balanced number of pods into each bucket. It's a required field.")

  public String getTopologyKey() {
    return topologyKey;
  }


  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }


  public V1TopologySpreadConstraint whenUnsatisfiable(String whenUnsatisfiable) {
    
    this.whenUnsatisfiable = whenUnsatisfiable;
    return this;
  }

   /**
   * WhenUnsatisfiable indicates how to deal with a pod if it doesn&#39;t satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It&#39;s considered as \&quot;Unsatisfiable\&quot; if and only if placing incoming pod on any topology violates \&quot;MaxSkew\&quot;. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won&#39;t make it *more* imbalanced. It&#39;s a required field.
   * @return whenUnsatisfiable
  **/
  @ApiModelProperty(required = true, value = "WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It's considered as \"Unsatisfiable\" if and only if placing incoming pod on any topology violates \"MaxSkew\". For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it *more* imbalanced. It's a required field.")

  public String getWhenUnsatisfiable() {
    return whenUnsatisfiable;
  }


  public void setWhenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TopologySpreadConstraint v1TopologySpreadConstraint = (V1TopologySpreadConstraint) o;
    return Objects.equals(this.labelSelector, v1TopologySpreadConstraint.labelSelector) &&
        Objects.equals(this.maxSkew, v1TopologySpreadConstraint.maxSkew) &&
        Objects.equals(this.topologyKey, v1TopologySpreadConstraint.topologyKey) &&
        Objects.equals(this.whenUnsatisfiable, v1TopologySpreadConstraint.whenUnsatisfiable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, maxSkew, topologyKey, whenUnsatisfiable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TopologySpreadConstraint {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    maxSkew: ").append(toIndentedString(maxSkew)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
    sb.append("    whenUnsatisfiable: ").append(toIndentedString(whenUnsatisfiable)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
