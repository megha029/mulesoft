
package com.app.accounts.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum Status {

    @JsonProperty("CLOSED")
    CLOSED("CLOSED"),
    @JsonProperty("DELINQUENT")
    DELINQUENT("DELINQUENT"),
    @JsonProperty("NEGATIVECURRENTBALANCE")
    NEGATIVECURRENTBALANCE("NEGATIVECURRENTBALANCE"),
    @JsonProperty("OPEN")
    OPEN("OPEN"),
    @JsonProperty("PAID")
    PAID("PAID"),
    @JsonProperty("PENDINGCLOSE")
    PENDINGCLOSE("PENDINGCLOSE"),
    @JsonProperty("PENDINGOPEN")
    PENDINGOPEN("PENDINGOPEN");
    private final String value;
    private final static Map<String, Status> VALUE_CACHE = new HashMap<String, Status>();

    static {
        for (Status c: values()) {
            VALUE_CACHE.put(c.value, c);
        }
    }

    private Status(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    public static Status fromValue(String value) {
        return VALUE_CACHE.get(value);
    }

    @Override
    public String toString() {
        return this.value;
    }

}
