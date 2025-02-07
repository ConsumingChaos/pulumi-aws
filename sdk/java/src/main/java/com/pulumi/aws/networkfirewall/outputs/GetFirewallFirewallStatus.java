// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.GetFirewallFirewallStatusCapacityUsageSummary;
import com.pulumi.aws.networkfirewall.outputs.GetFirewallFirewallStatusSyncState;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFirewallFirewallStatus {
    /**
     * @return Aggregated count of all resources used by reference sets in a firewall.
     * 
     */
    private List<GetFirewallFirewallStatusCapacityUsageSummary> capacityUsageSummaries;
    /**
     * @return Summary of sync states for all availability zones in which the firewall is configured.
     * 
     */
    private String configurationSyncStateSummary;
    private String status;
    /**
     * @return Set of subnets configured for use by the firewall.
     * 
     */
    private List<GetFirewallFirewallStatusSyncState> syncStates;

    private GetFirewallFirewallStatus() {}
    /**
     * @return Aggregated count of all resources used by reference sets in a firewall.
     * 
     */
    public List<GetFirewallFirewallStatusCapacityUsageSummary> capacityUsageSummaries() {
        return this.capacityUsageSummaries;
    }
    /**
     * @return Summary of sync states for all availability zones in which the firewall is configured.
     * 
     */
    public String configurationSyncStateSummary() {
        return this.configurationSyncStateSummary;
    }
    public String status() {
        return this.status;
    }
    /**
     * @return Set of subnets configured for use by the firewall.
     * 
     */
    public List<GetFirewallFirewallStatusSyncState> syncStates() {
        return this.syncStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallFirewallStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFirewallFirewallStatusCapacityUsageSummary> capacityUsageSummaries;
        private String configurationSyncStateSummary;
        private String status;
        private List<GetFirewallFirewallStatusSyncState> syncStates;
        public Builder() {}
        public Builder(GetFirewallFirewallStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityUsageSummaries = defaults.capacityUsageSummaries;
    	      this.configurationSyncStateSummary = defaults.configurationSyncStateSummary;
    	      this.status = defaults.status;
    	      this.syncStates = defaults.syncStates;
        }

        @CustomType.Setter
        public Builder capacityUsageSummaries(List<GetFirewallFirewallStatusCapacityUsageSummary> capacityUsageSummaries) {
            if (capacityUsageSummaries == null) {
              throw new MissingRequiredPropertyException("GetFirewallFirewallStatus", "capacityUsageSummaries");
            }
            this.capacityUsageSummaries = capacityUsageSummaries;
            return this;
        }
        public Builder capacityUsageSummaries(GetFirewallFirewallStatusCapacityUsageSummary... capacityUsageSummaries) {
            return capacityUsageSummaries(List.of(capacityUsageSummaries));
        }
        @CustomType.Setter
        public Builder configurationSyncStateSummary(String configurationSyncStateSummary) {
            if (configurationSyncStateSummary == null) {
              throw new MissingRequiredPropertyException("GetFirewallFirewallStatus", "configurationSyncStateSummary");
            }
            this.configurationSyncStateSummary = configurationSyncStateSummary;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetFirewallFirewallStatus", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder syncStates(List<GetFirewallFirewallStatusSyncState> syncStates) {
            if (syncStates == null) {
              throw new MissingRequiredPropertyException("GetFirewallFirewallStatus", "syncStates");
            }
            this.syncStates = syncStates;
            return this;
        }
        public Builder syncStates(GetFirewallFirewallStatusSyncState... syncStates) {
            return syncStates(List.of(syncStates));
        }
        public GetFirewallFirewallStatus build() {
            final var _resultValue = new GetFirewallFirewallStatus();
            _resultValue.capacityUsageSummaries = capacityUsageSummaries;
            _resultValue.configurationSyncStateSummary = configurationSyncStateSummary;
            _resultValue.status = status;
            _resultValue.syncStates = syncStates;
            return _resultValue;
        }
    }
}
