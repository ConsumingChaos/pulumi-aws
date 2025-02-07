// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterStepHadoopJarStep {
    /**
     * @return List of command line arguments passed to the JAR file&#39;s main function when executed.
     * 
     */
    private @Nullable List<String> args;
    /**
     * @return Path to a JAR file run during the step.
     * 
     */
    private String jar;
    /**
     * @return Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
     * 
     */
    private @Nullable String mainClass;
    /**
     * @return Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    private @Nullable Map<String,String> properties;

    private ClusterStepHadoopJarStep() {}
    /**
     * @return List of command line arguments passed to the JAR file&#39;s main function when executed.
     * 
     */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return Path to a JAR file run during the step.
     * 
     */
    public String jar() {
        return this.jar;
    }
    /**
     * @return Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
     * 
     */
    public Optional<String> mainClass() {
        return Optional.ofNullable(this.mainClass);
    }
    /**
     * @return Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterStepHadoopJarStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> args;
        private String jar;
        private @Nullable String mainClass;
        private @Nullable Map<String,String> properties;
        public Builder() {}
        public Builder(ClusterStepHadoopJarStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.jar = defaults.jar;
    	      this.mainClass = defaults.mainClass;
    	      this.properties = defaults.properties;
        }

        @CustomType.Setter
        public Builder args(@Nullable List<String> args) {

            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder jar(String jar) {
            if (jar == null) {
              throw new MissingRequiredPropertyException("ClusterStepHadoopJarStep", "jar");
            }
            this.jar = jar;
            return this;
        }
        @CustomType.Setter
        public Builder mainClass(@Nullable String mainClass) {

            this.mainClass = mainClass;
            return this;
        }
        @CustomType.Setter
        public Builder properties(@Nullable Map<String,String> properties) {

            this.properties = properties;
            return this;
        }
        public ClusterStepHadoopJarStep build() {
            final var _resultValue = new ClusterStepHadoopJarStep();
            _resultValue.args = args;
            _resultValue.jar = jar;
            _resultValue.mainClass = mainClass;
            _resultValue.properties = properties;
            return _resultValue;
        }
    }
}
