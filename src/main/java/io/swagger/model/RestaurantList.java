package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Restaurant
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-10T14:40:17.714141527Z[GMT]")


public class RestaurantList {
  @Valid
  private List<Restaurant> restaurantList = null;

  public RestaurantList results(List<Restaurant> results) {
    this.restaurantList = results;
    return this;
  }

  public RestaurantList addResultsItem(Restaurant resultsItem) {
    if (this.restaurantList == null) {
      this.restaurantList = new ArrayList<Restaurant>();
    }
    this.restaurantList.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   **/
  @Schema(description = "")
      @Valid
  @Size(max=10)   public List<Restaurant> getRestaurantList() {
    return restaurantList;
  }

  public void setRestaurantList(List<Restaurant> restaurantList) {
    this.restaurantList = restaurantList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestaurantList RestaurantList = (RestaurantList) o;
    return Objects.equals(this.restaurantList, RestaurantList.restaurantList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restaurantList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restaurant {\n");
    
    sb.append("    results: ").append(toIndentedString(restaurantList)).append("\n");
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
