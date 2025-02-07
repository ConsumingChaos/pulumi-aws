// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipeTargetParametersEcsTaskParametersNetworkConfigurationAwsVpcConfiguration {
    /**
     * @return Specifies whether the task&#39;s elastic network interface receives a public IP address. You can specify ENABLED only when LaunchType in EcsParameters is set to FARGATE. Valid Values: ENABLED, DISABLED.
     * 
     */
    private @Nullable String assignPublicIp;
    /**
     * @return List of security groups associated with the stream. These security groups must all be in the same VPC. You can specify as many as five security groups. If you do not specify a security group, the default security group for the VPC is used.
     * 
     */
    private @Nullable List<String> securityGroups;
    /**
     * @return List of the subnets associated with the stream. These subnets must all be in the same VPC. You can specify as many as 16 subnets.
     * 
     */
    private @Nullable List<String> subnets;

    private PipeTargetParametersEcsTaskParametersNetworkConfigurationAwsVpcConfiguration() {}
    /**
     * @return Specifies whether the task&#39;s elastic network interface receives a public IP address. You can specify ENABLED only when LaunchType in EcsParameters is set to FARGATE. Valid Values: ENABLED, DISABLED.
     * 
     */
    public Optional<String> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }
    /**
     * @return List of security groups associated with the stream. These security groups must all be in the same VPC. You can specify as many as five security groups. If you do not specify a security group, the default security group for the VPC is used.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return List of the subnets associated with the stream. These subnets must all be in the same VPC. You can specify as many as 16 subnets.
     * 
     */
    public List<String> subnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipeTargetParametersEcsTaskParametersNetworkConfigurationAwsVpcConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String assignPublicIp;
        private @Nullable List<String> securityGroups;
        private @Nullable List<String> subnets;
        public Builder() {}
        public Builder(PipeTargetParametersEcsTaskParametersNetworkConfigurationAwsVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        @CustomType.Setter
        public Builder assignPublicIp(@Nullable String assignPublicIp) {

            this.assignPublicIp = assignPublicIp;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(@Nullable List<String> securityGroups) {

            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder subnets(@Nullable List<String> subnets) {

            this.subnets = subnets;
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public PipeTargetParametersEcsTaskParametersNetworkConfigurationAwsVpcConfiguration build() {
            final var _resultValue = new PipeTargetParametersEcsTaskParametersNetworkConfigurationAwsVpcConfiguration();
            _resultValue.assignPublicIp = assignPublicIp;
            _resultValue.securityGroups = securityGroups;
            _resultValue.subnets = subnets;
            return _resultValue;
        }
    }
}
