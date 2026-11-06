package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetSearchSuggestionsResponse implements CloudDriveResponse {
    private List<SearchSuggestion> searchSuggestions;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof GetSearchSuggestionsResponse)) {
            return 1;
        }
        int compare = ObjectComparator.compare(getSearchSuggestions(), ((GetSearchSuggestionsResponse) cloudDriveResponse).getSearchSuggestions());
        if (compare != 0) {
            return compare;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetSearchSuggestionsResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public List<SearchSuggestion> getSearchSuggestions() {
        return this.searchSuggestions;
    }

    public int hashCode() {
        List<SearchSuggestion> list = this.searchSuggestions;
        return (((list == null ? 0 : list.hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setSearchSuggestions(List<SearchSuggestion> list) {
        this.searchSuggestions = list;
    }
}
