// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.config.inputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssumeRole {
    private @Nullable String duration;
    private @Nullable String externalId;
    private @Nullable String policy;
    private @Nullable List<String> policyArns;
    private @Nullable String roleArn;
    private @Nullable String sessionName;
    private @Nullable String sourceIdentity;
    private @Nullable Map<String,String> tags;
    private @Nullable List<String> transitiveTagKeys;

    private AssumeRole() {}
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }
    public Optional<String> externalId() {
        return Optional.ofNullable(this.externalId);
    }
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    public List<String> policyArns() {
        return this.policyArns == null ? List.of() : this.policyArns;
    }
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public Optional<String> sessionName() {
        return Optional.ofNullable(this.sessionName);
    }
    public Optional<String> sourceIdentity() {
        return Optional.ofNullable(this.sourceIdentity);
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public List<String> transitiveTagKeys() {
        return this.transitiveTagKeys == null ? List.of() : this.transitiveTagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssumeRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String duration;
        private @Nullable String externalId;
        private @Nullable String policy;
        private @Nullable List<String> policyArns;
        private @Nullable String roleArn;
        private @Nullable String sessionName;
        private @Nullable String sourceIdentity;
        private @Nullable Map<String,String> tags;
        private @Nullable List<String> transitiveTagKeys;
        public Builder() {}
        public Builder(AssumeRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.externalId = defaults.externalId;
    	      this.policy = defaults.policy;
    	      this.policyArns = defaults.policyArns;
    	      this.roleArn = defaults.roleArn;
    	      this.sessionName = defaults.sessionName;
    	      this.sourceIdentity = defaults.sourceIdentity;
    	      this.tags = defaults.tags;
    	      this.transitiveTagKeys = defaults.transitiveTagKeys;
        }

        @CustomType.Setter
        public Builder duration(@Nullable String duration) {

            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder externalId(@Nullable String externalId) {

            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable String policy) {

            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder policyArns(@Nullable List<String> policyArns) {

            this.policyArns = policyArns;
            return this;
        }
        public Builder policyArns(String... policyArns) {
            return policyArns(List.of(policyArns));
        }
        @CustomType.Setter
        public Builder roleArn(@Nullable String roleArn) {

            this.roleArn = roleArn;
            return this;
        }
        @CustomType.Setter
        public Builder sessionName(@Nullable String sessionName) {

            this.sessionName = sessionName;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIdentity(@Nullable String sourceIdentity) {

            this.sourceIdentity = sourceIdentity;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder transitiveTagKeys(@Nullable List<String> transitiveTagKeys) {

            this.transitiveTagKeys = transitiveTagKeys;
            return this;
        }
        public Builder transitiveTagKeys(String... transitiveTagKeys) {
            return transitiveTagKeys(List.of(transitiveTagKeys));
        }
        public AssumeRole build() {
            final var _resultValue = new AssumeRole();
            _resultValue.duration = duration;
            _resultValue.externalId = externalId;
            _resultValue.policy = policy;
            _resultValue.policyArns = policyArns;
            _resultValue.roleArn = roleArn;
            _resultValue.sessionName = sessionName;
            _resultValue.sourceIdentity = sourceIdentity;
            _resultValue.tags = tags;
            _resultValue.transitiveTagKeys = transitiveTagKeys;
            return _resultValue;
        }
    }
}
