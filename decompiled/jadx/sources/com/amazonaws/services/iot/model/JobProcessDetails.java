package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JobProcessDetails implements Serializable {
    private Integer numberOfCanceledThings;
    private Integer numberOfFailedThings;
    private Integer numberOfInProgressThings;
    private Integer numberOfQueuedThings;
    private Integer numberOfRejectedThings;
    private Integer numberOfRemovedThings;
    private Integer numberOfSucceededThings;
    private Integer numberOfTimedOutThings;
    private List<String> processingTargets;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof JobProcessDetails)) {
            return false;
        }
        JobProcessDetails jobProcessDetails = (JobProcessDetails) obj;
        if ((jobProcessDetails.getProcessingTargets() == null) ^ (getProcessingTargets() == null)) {
            return false;
        }
        if (jobProcessDetails.getProcessingTargets() != null && !jobProcessDetails.getProcessingTargets().equals(getProcessingTargets())) {
            return false;
        }
        if ((jobProcessDetails.getNumberOfCanceledThings() == null) ^ (getNumberOfCanceledThings() == null)) {
            return false;
        }
        if (jobProcessDetails.getNumberOfCanceledThings() != null && !jobProcessDetails.getNumberOfCanceledThings().equals(getNumberOfCanceledThings())) {
            return false;
        }
        if ((jobProcessDetails.getNumberOfSucceededThings() == null) ^ (getNumberOfSucceededThings() == null)) {
            return false;
        }
        if (jobProcessDetails.getNumberOfSucceededThings() != null && !jobProcessDetails.getNumberOfSucceededThings().equals(getNumberOfSucceededThings())) {
            return false;
        }
        if ((jobProcessDetails.getNumberOfFailedThings() == null) ^ (getNumberOfFailedThings() == null)) {
            return false;
        }
        if (jobProcessDetails.getNumberOfFailedThings() != null && !jobProcessDetails.getNumberOfFailedThings().equals(getNumberOfFailedThings())) {
            return false;
        }
        if ((jobProcessDetails.getNumberOfRejectedThings() == null) ^ (getNumberOfRejectedThings() == null)) {
            return false;
        }
        if (jobProcessDetails.getNumberOfRejectedThings() != null && !jobProcessDetails.getNumberOfRejectedThings().equals(getNumberOfRejectedThings())) {
            return false;
        }
        if ((jobProcessDetails.getNumberOfQueuedThings() == null) ^ (getNumberOfQueuedThings() == null)) {
            return false;
        }
        if (jobProcessDetails.getNumberOfQueuedThings() != null && !jobProcessDetails.getNumberOfQueuedThings().equals(getNumberOfQueuedThings())) {
            return false;
        }
        if ((jobProcessDetails.getNumberOfInProgressThings() == null) ^ (getNumberOfInProgressThings() == null)) {
            return false;
        }
        if (jobProcessDetails.getNumberOfInProgressThings() != null && !jobProcessDetails.getNumberOfInProgressThings().equals(getNumberOfInProgressThings())) {
            return false;
        }
        if ((jobProcessDetails.getNumberOfRemovedThings() == null) ^ (getNumberOfRemovedThings() == null)) {
            return false;
        }
        if (jobProcessDetails.getNumberOfRemovedThings() != null && !jobProcessDetails.getNumberOfRemovedThings().equals(getNumberOfRemovedThings())) {
            return false;
        }
        if ((jobProcessDetails.getNumberOfTimedOutThings() == null) ^ (getNumberOfTimedOutThings() == null)) {
            return false;
        }
        return jobProcessDetails.getNumberOfTimedOutThings() == null || jobProcessDetails.getNumberOfTimedOutThings().equals(getNumberOfTimedOutThings());
    }

    public Integer getNumberOfCanceledThings() {
        return this.numberOfCanceledThings;
    }

    public Integer getNumberOfFailedThings() {
        return this.numberOfFailedThings;
    }

    public Integer getNumberOfInProgressThings() {
        return this.numberOfInProgressThings;
    }

    public Integer getNumberOfQueuedThings() {
        return this.numberOfQueuedThings;
    }

    public Integer getNumberOfRejectedThings() {
        return this.numberOfRejectedThings;
    }

    public Integer getNumberOfRemovedThings() {
        return this.numberOfRemovedThings;
    }

    public Integer getNumberOfSucceededThings() {
        return this.numberOfSucceededThings;
    }

    public Integer getNumberOfTimedOutThings() {
        return this.numberOfTimedOutThings;
    }

    public List<String> getProcessingTargets() {
        return this.processingTargets;
    }

    public int hashCode() {
        return (((((((((((((((((getProcessingTargets() == null ? 0 : getProcessingTargets().hashCode()) + 31) * 31) + (getNumberOfCanceledThings() == null ? 0 : getNumberOfCanceledThings().hashCode())) * 31) + (getNumberOfSucceededThings() == null ? 0 : getNumberOfSucceededThings().hashCode())) * 31) + (getNumberOfFailedThings() == null ? 0 : getNumberOfFailedThings().hashCode())) * 31) + (getNumberOfRejectedThings() == null ? 0 : getNumberOfRejectedThings().hashCode())) * 31) + (getNumberOfQueuedThings() == null ? 0 : getNumberOfQueuedThings().hashCode())) * 31) + (getNumberOfInProgressThings() == null ? 0 : getNumberOfInProgressThings().hashCode())) * 31) + (getNumberOfRemovedThings() == null ? 0 : getNumberOfRemovedThings().hashCode())) * 31) + (getNumberOfTimedOutThings() != null ? getNumberOfTimedOutThings().hashCode() : 0);
    }

    public void setNumberOfCanceledThings(Integer num) {
        this.numberOfCanceledThings = num;
    }

    public void setNumberOfFailedThings(Integer num) {
        this.numberOfFailedThings = num;
    }

    public void setNumberOfInProgressThings(Integer num) {
        this.numberOfInProgressThings = num;
    }

    public void setNumberOfQueuedThings(Integer num) {
        this.numberOfQueuedThings = num;
    }

    public void setNumberOfRejectedThings(Integer num) {
        this.numberOfRejectedThings = num;
    }

    public void setNumberOfRemovedThings(Integer num) {
        this.numberOfRemovedThings = num;
    }

    public void setNumberOfSucceededThings(Integer num) {
        this.numberOfSucceededThings = num;
    }

    public void setNumberOfTimedOutThings(Integer num) {
        this.numberOfTimedOutThings = num;
    }

    public void setProcessingTargets(Collection<String> collection) {
        if (collection == null) {
            this.processingTargets = null;
        } else {
            this.processingTargets = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getProcessingTargets() != null) {
            sb.append("processingTargets: " + getProcessingTargets() + ",");
        }
        if (getNumberOfCanceledThings() != null) {
            sb.append("numberOfCanceledThings: " + getNumberOfCanceledThings() + ",");
        }
        if (getNumberOfSucceededThings() != null) {
            sb.append("numberOfSucceededThings: " + getNumberOfSucceededThings() + ",");
        }
        if (getNumberOfFailedThings() != null) {
            sb.append("numberOfFailedThings: " + getNumberOfFailedThings() + ",");
        }
        if (getNumberOfRejectedThings() != null) {
            sb.append("numberOfRejectedThings: " + getNumberOfRejectedThings() + ",");
        }
        if (getNumberOfQueuedThings() != null) {
            sb.append("numberOfQueuedThings: " + getNumberOfQueuedThings() + ",");
        }
        if (getNumberOfInProgressThings() != null) {
            sb.append("numberOfInProgressThings: " + getNumberOfInProgressThings() + ",");
        }
        if (getNumberOfRemovedThings() != null) {
            sb.append("numberOfRemovedThings: " + getNumberOfRemovedThings() + ",");
        }
        if (getNumberOfTimedOutThings() != null) {
            sb.append("numberOfTimedOutThings: " + getNumberOfTimedOutThings());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public JobProcessDetails withNumberOfCanceledThings(Integer num) {
        this.numberOfCanceledThings = num;
        return this;
    }

    public JobProcessDetails withNumberOfFailedThings(Integer num) {
        this.numberOfFailedThings = num;
        return this;
    }

    public JobProcessDetails withNumberOfInProgressThings(Integer num) {
        this.numberOfInProgressThings = num;
        return this;
    }

    public JobProcessDetails withNumberOfQueuedThings(Integer num) {
        this.numberOfQueuedThings = num;
        return this;
    }

    public JobProcessDetails withNumberOfRejectedThings(Integer num) {
        this.numberOfRejectedThings = num;
        return this;
    }

    public JobProcessDetails withNumberOfRemovedThings(Integer num) {
        this.numberOfRemovedThings = num;
        return this;
    }

    public JobProcessDetails withNumberOfSucceededThings(Integer num) {
        this.numberOfSucceededThings = num;
        return this;
    }

    public JobProcessDetails withNumberOfTimedOutThings(Integer num) {
        this.numberOfTimedOutThings = num;
        return this;
    }

    public JobProcessDetails withProcessingTargets(String... strArr) {
        if (getProcessingTargets() == null) {
            this.processingTargets = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.processingTargets.add(str);
        }
        return this;
    }

    public JobProcessDetails withProcessingTargets(Collection<String> collection) {
        setProcessingTargets(collection);
        return this;
    }
}
