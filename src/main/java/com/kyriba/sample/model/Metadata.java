/*
 * Accounts
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kyriba.sample.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import java.util.Objects;

/**
 * Metadata
 */

public class Metadata {
    @SerializedName("links")
    private Links links = null;

    @SerializedName("numberOfTotalResults")
    private Long numberOfTotalResults = null;

    @SerializedName("pageLimit")
    @Min(value = 1, message = "must be greater than 0")
    private Integer pageLimit = null;

    @SerializedName("pageOffset")
    @Min(value = 0, message = "must be not less than 0")
    private Integer pageOffset = null;

    @SerializedName("pageResults")
    private Long pageResults = null;

    public Metadata links(Links links) {
        this.links = links;
        return this;
    }

    /**
     * Links for pages.
     *
     * @return links
     **/
    @ApiModelProperty(value = "Links for pages.")
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Metadata numberOfTotalResults(Long numberOfTotalResults) {
        this.numberOfTotalResults = numberOfTotalResults;
        return this;
    }

    /**
     * The number of total records.
     * minimum: 0
     *
     * @return numberOfTotalResults
     **/
    @ApiModelProperty(example = "100", value = "The number of total records.")
    public Long getNumberOfTotalResults() {
        return numberOfTotalResults;
    }

    public void setNumberOfTotalResults(Long numberOfTotalResults) {
        this.numberOfTotalResults = numberOfTotalResults;
    }

    public Metadata pageLimit(Integer pageLimit) {
        this.pageLimit = pageLimit;
        return this;
    }

    /**
     * Limit the number of records per page. By default 100.
     * minimum: 1
     *
     * @return pageLimit
     **/
    @ApiModelProperty(example = "100", value = "Limit the number of records per page. By default 100.")
    public Integer getPageLimit() {
        return pageLimit;
    }

    public void setPageLimit(Integer pageLimit) {
        this.pageLimit = pageLimit;
    }

    public Metadata pageOffset(Integer pageOffset) {
        this.pageOffset = pageOffset;
        return this;
    }

    /**
     * Page Offset means the number of records you want to skip before starting reading. By default 0.
     * minimum: 0
     *
     * @return pageOffset
     **/
    @ApiModelProperty(example = "0", value = "Page Offset means the number of records you want to skip before starting reading. By default 0.")
    public Integer getPageOffset() {
        return pageOffset;
    }

    public void setPageOffset(Integer pageOffset) {
        this.pageOffset = pageOffset;
    }

    public Metadata pageResults(Long pageResults) {
        this.pageResults = pageResults;
        return this;
    }

    /**
     * The number of records in current page.
     * minimum: 0
     *
     * @return pageResults
     **/
    @ApiModelProperty(example = "10", value = "The number of records in current page.")
    public Long getPageResults() {
        return pageResults;
    }

    public void setPageResults(Long pageResults) {
        this.pageResults = pageResults;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) o;
        return Objects.equals(this.links, metadata.links) &&
                Objects.equals(this.numberOfTotalResults, metadata.numberOfTotalResults) &&
                Objects.equals(this.pageLimit, metadata.pageLimit) &&
                Objects.equals(this.pageOffset, metadata.pageOffset) &&
                Objects.equals(this.pageResults, metadata.pageResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, numberOfTotalResults, pageLimit, pageOffset, pageResults);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");

        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    numberOfTotalResults: ").append(toIndentedString(numberOfTotalResults)).append("\n");
        sb.append("    pageLimit: ").append(toIndentedString(pageLimit)).append("\n");
        sb.append("    pageOffset: ").append(toIndentedString(pageOffset)).append("\n");
        sb.append("    pageResults: ").append(toIndentedString(pageResults)).append("\n");
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

