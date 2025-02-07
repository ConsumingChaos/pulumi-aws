// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecGrpcRouteMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteMatchArgs Empty = new RouteSpecGrpcRouteMatchArgs();

    /**
     * Data to match from the gRPC request.
     * 
     */
    @Import(name="metadatas")
    private @Nullable Output<List<RouteSpecGrpcRouteMatchMetadataArgs>> metadatas;

    /**
     * @return Data to match from the gRPC request.
     * 
     */
    public Optional<Output<List<RouteSpecGrpcRouteMatchMetadataArgs>>> metadatas() {
        return Optional.ofNullable(this.metadatas);
    }

    /**
     * Method name to match from the request. If you specify a name, you must also specify a `service_name`.
     * 
     */
    @Import(name="methodName")
    private @Nullable Output<String> methodName;

    /**
     * @return Method name to match from the request. If you specify a name, you must also specify a `service_name`.
     * 
     */
    public Optional<Output<String>> methodName() {
        return Optional.ofNullable(this.methodName);
    }

    /**
     * The port number to match from the request.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number to match from the request.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Header value sent by the client must begin with the specified characters.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Header value sent by the client must begin with the specified characters.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Fully qualified domain name for the service to match from the request.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return Fully qualified domain name for the service to match from the request.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private RouteSpecGrpcRouteMatchArgs() {}

    private RouteSpecGrpcRouteMatchArgs(RouteSpecGrpcRouteMatchArgs $) {
        this.metadatas = $.metadatas;
        this.methodName = $.methodName;
        this.port = $.port;
        this.prefix = $.prefix;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecGrpcRouteMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecGrpcRouteMatchArgs $;

        public Builder() {
            $ = new RouteSpecGrpcRouteMatchArgs();
        }

        public Builder(RouteSpecGrpcRouteMatchArgs defaults) {
            $ = new RouteSpecGrpcRouteMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadatas Data to match from the gRPC request.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(@Nullable Output<List<RouteSpecGrpcRouteMatchMetadataArgs>> metadatas) {
            $.metadatas = metadatas;
            return this;
        }

        /**
         * @param metadatas Data to match from the gRPC request.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(List<RouteSpecGrpcRouteMatchMetadataArgs> metadatas) {
            return metadatas(Output.of(metadatas));
        }

        /**
         * @param metadatas Data to match from the gRPC request.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(RouteSpecGrpcRouteMatchMetadataArgs... metadatas) {
            return metadatas(List.of(metadatas));
        }

        /**
         * @param methodName Method name to match from the request. If you specify a name, you must also specify a `service_name`.
         * 
         * @return builder
         * 
         */
        public Builder methodName(@Nullable Output<String> methodName) {
            $.methodName = methodName;
            return this;
        }

        /**
         * @param methodName Method name to match from the request. If you specify a name, you must also specify a `service_name`.
         * 
         * @return builder
         * 
         */
        public Builder methodName(String methodName) {
            return methodName(Output.of(methodName));
        }

        /**
         * @param port The port number to match from the request.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number to match from the request.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param prefix Header value sent by the client must begin with the specified characters.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Header value sent by the client must begin with the specified characters.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param serviceName Fully qualified domain name for the service to match from the request.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Fully qualified domain name for the service to match from the request.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public RouteSpecGrpcRouteMatchArgs build() {
            return $;
        }
    }

}
