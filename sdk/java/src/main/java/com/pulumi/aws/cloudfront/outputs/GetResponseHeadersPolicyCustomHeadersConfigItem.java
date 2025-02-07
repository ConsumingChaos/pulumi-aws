// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResponseHeadersPolicyCustomHeadersConfigItem {
    /**
     * @return The HTTP header name.
     * 
     */
    private String header;
    /**
     * @return Whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    private Boolean override;
    /**
     * @return Value for the HTTP response header.
     * 
     */
    private String value;

    private GetResponseHeadersPolicyCustomHeadersConfigItem() {}
    /**
     * @return The HTTP header name.
     * 
     */
    public String header() {
        return this.header;
    }
    /**
     * @return Whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Boolean override() {
        return this.override;
    }
    /**
     * @return Value for the HTTP response header.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicyCustomHeadersConfigItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String header;
        private Boolean override;
        private String value;
        public Builder() {}
        public Builder(GetResponseHeadersPolicyCustomHeadersConfigItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.override = defaults.override;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder header(String header) {
            if (header == null) {
              throw new MissingRequiredPropertyException("GetResponseHeadersPolicyCustomHeadersConfigItem", "header");
            }
            this.header = header;
            return this;
        }
        @CustomType.Setter
        public Builder override(Boolean override) {
            if (override == null) {
              throw new MissingRequiredPropertyException("GetResponseHeadersPolicyCustomHeadersConfigItem", "override");
            }
            this.override = override;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetResponseHeadersPolicyCustomHeadersConfigItem", "value");
            }
            this.value = value;
            return this;
        }
        public GetResponseHeadersPolicyCustomHeadersConfigItem build() {
            final var _resultValue = new GetResponseHeadersPolicyCustomHeadersConfigItem();
            _resultValue.header = header;
            _resultValue.override = override;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
