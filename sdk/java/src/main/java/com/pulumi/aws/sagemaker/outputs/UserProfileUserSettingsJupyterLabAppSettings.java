// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.UserProfileUserSettingsJupyterLabAppSettingsCodeRepository;
import com.pulumi.aws.sagemaker.outputs.UserProfileUserSettingsJupyterLabAppSettingsCustomImage;
import com.pulumi.aws.sagemaker.outputs.UserProfileUserSettingsJupyterLabAppSettingsDefaultResourceSpec;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserProfileUserSettingsJupyterLabAppSettings {
    /**
     * @return A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
     * 
     */
    private @Nullable List<UserProfileUserSettingsJupyterLabAppSettingsCodeRepository> codeRepositories;
    /**
     * @return A list of custom SageMaker images that are configured to run as a KernelGateway app. see Custom Image below.
     * 
     */
    private @Nullable List<UserProfileUserSettingsJupyterLabAppSettingsCustomImage> customImages;
    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    private @Nullable UserProfileUserSettingsJupyterLabAppSettingsDefaultResourceSpec defaultResourceSpec;
    /**
     * @return The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    private @Nullable List<String> lifecycleConfigArns;

    private UserProfileUserSettingsJupyterLabAppSettings() {}
    /**
     * @return A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterServer application. see Code Repository below.
     * 
     */
    public List<UserProfileUserSettingsJupyterLabAppSettingsCodeRepository> codeRepositories() {
        return this.codeRepositories == null ? List.of() : this.codeRepositories;
    }
    /**
     * @return A list of custom SageMaker images that are configured to run as a KernelGateway app. see Custom Image below.
     * 
     */
    public List<UserProfileUserSettingsJupyterLabAppSettingsCustomImage> customImages() {
        return this.customImages == null ? List.of() : this.customImages;
    }
    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    public Optional<UserProfileUserSettingsJupyterLabAppSettingsDefaultResourceSpec> defaultResourceSpec() {
        return Optional.ofNullable(this.defaultResourceSpec);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    public List<String> lifecycleConfigArns() {
        return this.lifecycleConfigArns == null ? List.of() : this.lifecycleConfigArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsJupyterLabAppSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<UserProfileUserSettingsJupyterLabAppSettingsCodeRepository> codeRepositories;
        private @Nullable List<UserProfileUserSettingsJupyterLabAppSettingsCustomImage> customImages;
        private @Nullable UserProfileUserSettingsJupyterLabAppSettingsDefaultResourceSpec defaultResourceSpec;
        private @Nullable List<String> lifecycleConfigArns;
        public Builder() {}
        public Builder(UserProfileUserSettingsJupyterLabAppSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeRepositories = defaults.codeRepositories;
    	      this.customImages = defaults.customImages;
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
    	      this.lifecycleConfigArns = defaults.lifecycleConfigArns;
        }

        @CustomType.Setter
        public Builder codeRepositories(@Nullable List<UserProfileUserSettingsJupyterLabAppSettingsCodeRepository> codeRepositories) {

            this.codeRepositories = codeRepositories;
            return this;
        }
        public Builder codeRepositories(UserProfileUserSettingsJupyterLabAppSettingsCodeRepository... codeRepositories) {
            return codeRepositories(List.of(codeRepositories));
        }
        @CustomType.Setter
        public Builder customImages(@Nullable List<UserProfileUserSettingsJupyterLabAppSettingsCustomImage> customImages) {

            this.customImages = customImages;
            return this;
        }
        public Builder customImages(UserProfileUserSettingsJupyterLabAppSettingsCustomImage... customImages) {
            return customImages(List.of(customImages));
        }
        @CustomType.Setter
        public Builder defaultResourceSpec(@Nullable UserProfileUserSettingsJupyterLabAppSettingsDefaultResourceSpec defaultResourceSpec) {

            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }
        @CustomType.Setter
        public Builder lifecycleConfigArns(@Nullable List<String> lifecycleConfigArns) {

            this.lifecycleConfigArns = lifecycleConfigArns;
            return this;
        }
        public Builder lifecycleConfigArns(String... lifecycleConfigArns) {
            return lifecycleConfigArns(List.of(lifecycleConfigArns));
        }
        public UserProfileUserSettingsJupyterLabAppSettings build() {
            final var _resultValue = new UserProfileUserSettingsJupyterLabAppSettings();
            _resultValue.codeRepositories = codeRepositories;
            _resultValue.customImages = customImages;
            _resultValue.defaultResourceSpec = defaultResourceSpec;
            _resultValue.lifecycleConfigArns = lifecycleConfigArns;
            return _resultValue;
        }
    }
}
