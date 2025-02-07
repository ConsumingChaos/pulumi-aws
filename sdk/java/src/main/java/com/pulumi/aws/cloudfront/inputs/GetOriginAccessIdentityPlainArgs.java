// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetOriginAccessIdentityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOriginAccessIdentityPlainArgs Empty = new GetOriginAccessIdentityPlainArgs();

    /**
     * The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetOriginAccessIdentityPlainArgs() {}

    private GetOriginAccessIdentityPlainArgs(GetOriginAccessIdentityPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOriginAccessIdentityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOriginAccessIdentityPlainArgs $;

        public Builder() {
            $ = new GetOriginAccessIdentityPlainArgs();
        }

        public Builder(GetOriginAccessIdentityPlainArgs defaults) {
            $ = new GetOriginAccessIdentityPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetOriginAccessIdentityPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetOriginAccessIdentityPlainArgs", "id");
            }
            return $;
        }
    }

}
