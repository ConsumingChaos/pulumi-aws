// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeguruprofiler;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs;
import com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupState;
import com.pulumi.aws.codeguruprofiler.outputs.ProfilingGroupAgentOrchestrationConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS CodeGuru Profiler Profiling Group.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.codeguruprofiler.ProfilingGroup;
 * import com.pulumi.aws.codeguruprofiler.ProfilingGroupArgs;
 * import com.pulumi.aws.codeguruprofiler.inputs.ProfilingGroupAgentOrchestrationConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ProfilingGroup(&#34;example&#34;, ProfilingGroupArgs.builder()        
 *             .agentOrchestrationConfig(ProfilingGroupAgentOrchestrationConfigArgs.builder()
 *                 .profilingEnabled(true)
 *                 .build())
 *             .computePlatform(&#34;Default&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CodeGuru Profiler Profiling Group using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:codeguruprofiler/profilingGroup:ProfilingGroup example profiling_group-name-12345678
 * ```
 * 
 */
@ResourceType(type="aws:codeguruprofiler/profilingGroup:ProfilingGroup")
public class ProfilingGroup extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
     * 
     */
    @Export(name="agentOrchestrationConfig", refs={ProfilingGroupAgentOrchestrationConfig.class}, tree="[0]")
    private Output</* @Nullable */ ProfilingGroupAgentOrchestrationConfig> agentOrchestrationConfig;

    /**
     * @return Specifies whether profiling is enabled or disabled for the created profiling. See Agent Orchestration Config for more details.
     * 
     */
    public Output<Optional<ProfilingGroupAgentOrchestrationConfig>> agentOrchestrationConfig() {
        return Codegen.optional(this.agentOrchestrationConfig);
    }
    /**
     * ARN of the profiling group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the profiling group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Compute platform of the profiling group.
     * 
     */
    @Export(name="computePlatform", refs={String.class}, tree="[0]")
    private Output<String> computePlatform;

    /**
     * @return Compute platform of the profiling group.
     * 
     */
    public Output<String> computePlatform() {
        return this.computePlatform;
    }
    /**
     * Name of the profiling group.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the profiling group.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProfilingGroup(String name) {
        this(name, ProfilingGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProfilingGroup(String name, @Nullable ProfilingGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProfilingGroup(String name, @Nullable ProfilingGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codeguruprofiler/profilingGroup:ProfilingGroup", name, args == null ? ProfilingGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProfilingGroup(String name, Output<String> id, @Nullable ProfilingGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codeguruprofiler/profilingGroup:ProfilingGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "tagsAll"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ProfilingGroup get(String name, Output<String> id, @Nullable ProfilingGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProfilingGroup(name, id, state, options);
    }
}
