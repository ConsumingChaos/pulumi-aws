// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionConfirmationState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionConfirmationState Empty = new ConnectionConfirmationState();

    /**
     * The ID of the hosted connection.
     * 
     */
    @Import(name="connectionId")
    private @Nullable Output<String> connectionId;

    /**
     * @return The ID of the hosted connection.
     * 
     */
    public Optional<Output<String>> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }

    private ConnectionConfirmationState() {}

    private ConnectionConfirmationState(ConnectionConfirmationState $) {
        this.connectionId = $.connectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionConfirmationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionConfirmationState $;

        public Builder() {
            $ = new ConnectionConfirmationState();
        }

        public Builder(ConnectionConfirmationState defaults) {
            $ = new ConnectionConfirmationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId The ID of the hosted connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(@Nullable Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId The ID of the hosted connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        public ConnectionConfirmationState build() {
            return $;
        }
    }

}
