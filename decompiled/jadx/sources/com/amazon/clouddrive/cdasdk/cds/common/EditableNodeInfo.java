package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EditableNodeInfo {

    @SerializedName("accessRuleIds")
    @Expose
    private List<String> accessRuleIds;

    @SerializedName("assetProperties")
    @Expose
    private AssetProperties assetProperties;

    @SerializedName("childAssetTypeInfo")
    @Expose
    private List<ChildAssetTypeInfo> childAssetTypeInfo;

    @SerializedName("clientProperties")
    @Expose
    private ClientProperties clientProperties;

    @SerializedName("collectionProperties")
    @Expose
    private CollectionProperties collectionProperties;

    @SerializedName("contentProperties")
    @Expose
    private ContentProperties contentProperties;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("familyId")
    @Expose
    private String familyId;

    @SerializedName("groupPermissions")
    @Expose
    private List<GroupPermission> groupPermissions;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("keywords")
    @Expose
    private List<String> keywords;

    @SerializedName(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME)
    @Expose
    private String kind;

    @SerializedName(Content.LABELS)
    @Expose
    private List<String> labels;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("parentMap")
    @Expose
    private Map<String, List<String>> parentMap;

    @SerializedName("parents")
    @Expose
    private List<String> parents;

    @SerializedName("properties")
    @Expose
    private Map<String, Map<String, String>> properties;

    @SerializedName("protectedFolder")
    @Expose
    private Boolean protectedFolder;

    @SerializedName("restricted")
    @Expose
    private Boolean restricted;

    @SerializedName("secondaryProperties")
    @Expose
    private Map<String, Map<String, String>> secondaryProperties;

    @SerializedName("settings")
    @Expose
    private Settings settings;

    @SerializedName("sourceId")
    @Expose
    private String sourceId;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("subKindProperties")
    @Expose
    private SubKindProperties subKindProperties;

    @SerializedName("subKinds")
    @Expose
    private List<String> subKinds;

    @SerializedName("symbolicNodeHeroId")
    @Expose
    private String symbolicNodeHeroId;

    @SerializedName(PhotoSearchCategory.THINGS)
    @Expose
    private List<String> things;

    @SerializedName("transforms")
    @Expose
    private List<String> transforms;

    @SerializedName("xAccntParentMap")
    @Expose
    private Map<String, List<String>> xAccntParentMap;

    @SerializedName("xAccntParents")
    @Expose
    private List<String> xAccntParents;

    @Generated
    public EditableNodeInfo() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof EditableNodeInfo;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EditableNodeInfo)) {
            return false;
        }
        EditableNodeInfo editableNodeInfo = (EditableNodeInfo) obj;
        if (!editableNodeInfo.canEqual(this)) {
            return false;
        }
        Boolean restricted = getRestricted();
        Boolean restricted2 = editableNodeInfo.getRestricted();
        if (restricted != null ? !restricted.equals(restricted2) : restricted2 != null) {
            return false;
        }
        Boolean protectedFolder = getProtectedFolder();
        Boolean protectedFolder2 = editableNodeInfo.getProtectedFolder();
        if (protectedFolder != null ? !protectedFolder.equals(protectedFolder2) : protectedFolder2 != null) {
            return false;
        }
        String id = getId();
        String id2 = editableNodeInfo.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String familyId = getFamilyId();
        String familyId2 = editableNodeInfo.getFamilyId();
        if (familyId != null ? !familyId.equals(familyId2) : familyId2 != null) {
            return false;
        }
        String name = getName();
        String name2 = editableNodeInfo.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String description = getDescription();
        String description2 = editableNodeInfo.getDescription();
        if (description != null ? !description.equals(description2) : description2 != null) {
            return false;
        }
        List<String> labels = getLabels();
        List<String> labels2 = editableNodeInfo.getLabels();
        if (labels != null ? !labels.equals(labels2) : labels2 != null) {
            return false;
        }
        String kind = getKind();
        String kind2 = editableNodeInfo.getKind();
        if (kind != null ? !kind.equals(kind2) : kind2 != null) {
            return false;
        }
        List<String> subKinds = getSubKinds();
        List<String> subKinds2 = editableNodeInfo.getSubKinds();
        if (subKinds != null ? !subKinds.equals(subKinds2) : subKinds2 != null) {
            return false;
        }
        List<String> parents = getParents();
        List<String> parents2 = editableNodeInfo.getParents();
        if (parents != null ? !parents.equals(parents2) : parents2 != null) {
            return false;
        }
        List<String> xAccntParents = getXAccntParents();
        List<String> xAccntParents2 = editableNodeInfo.getXAccntParents();
        if (xAccntParents != null ? !xAccntParents.equals(xAccntParents2) : xAccntParents2 != null) {
            return false;
        }
        Map<String, List<String>> parentMap = getParentMap();
        Map<String, List<String>> parentMap2 = editableNodeInfo.getParentMap();
        if (parentMap != null ? !parentMap.equals(parentMap2) : parentMap2 != null) {
            return false;
        }
        Map<String, List<String>> xAccntParentMap = getXAccntParentMap();
        Map<String, List<String>> xAccntParentMap2 = editableNodeInfo.getXAccntParentMap();
        if (xAccntParentMap != null ? !xAccntParentMap.equals(xAccntParentMap2) : xAccntParentMap2 != null) {
            return false;
        }
        Map<String, Map<String, String>> properties = getProperties();
        Map<String, Map<String, String>> properties2 = editableNodeInfo.getProperties();
        if (properties != null ? !properties.equals(properties2) : properties2 != null) {
            return false;
        }
        Map<String, Map<String, String>> secondaryProperties = getSecondaryProperties();
        Map<String, Map<String, String>> secondaryProperties2 = editableNodeInfo.getSecondaryProperties();
        if (secondaryProperties != null ? !secondaryProperties.equals(secondaryProperties2) : secondaryProperties2 != null) {
            return false;
        }
        ContentProperties contentProperties = getContentProperties();
        ContentProperties contentProperties2 = editableNodeInfo.getContentProperties();
        if (contentProperties != null ? !contentProperties.equals(contentProperties2) : contentProperties2 != null) {
            return false;
        }
        String status = getStatus();
        String status2 = editableNodeInfo.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Settings settings = getSettings();
        Settings settings2 = editableNodeInfo.getSettings();
        if (settings != null ? !settings.equals(settings2) : settings2 != null) {
            return false;
        }
        List<String> transforms = getTransforms();
        List<String> transforms2 = editableNodeInfo.getTransforms();
        if (transforms != null ? !transforms.equals(transforms2) : transforms2 != null) {
            return false;
        }
        CollectionProperties collectionProperties = getCollectionProperties();
        CollectionProperties collectionProperties2 = editableNodeInfo.getCollectionProperties();
        if (collectionProperties != null ? !collectionProperties.equals(collectionProperties2) : collectionProperties2 != null) {
            return false;
        }
        String sourceId = getSourceId();
        String sourceId2 = editableNodeInfo.getSourceId();
        if (sourceId != null ? !sourceId.equals(sourceId2) : sourceId2 != null) {
            return false;
        }
        List<String> keywords = getKeywords();
        List<String> keywords2 = editableNodeInfo.getKeywords();
        if (keywords != null ? !keywords.equals(keywords2) : keywords2 != null) {
            return false;
        }
        ClientProperties clientProperties = getClientProperties();
        ClientProperties clientProperties2 = editableNodeInfo.getClientProperties();
        if (clientProperties != null ? !clientProperties.equals(clientProperties2) : clientProperties2 != null) {
            return false;
        }
        List<String> things = getThings();
        List<String> things2 = editableNodeInfo.getThings();
        if (things != null ? !things.equals(things2) : things2 != null) {
            return false;
        }
        List<String> accessRuleIds = getAccessRuleIds();
        List<String> accessRuleIds2 = editableNodeInfo.getAccessRuleIds();
        if (accessRuleIds != null ? !accessRuleIds.equals(accessRuleIds2) : accessRuleIds2 != null) {
            return false;
        }
        List<ChildAssetTypeInfo> childAssetTypeInfo = getChildAssetTypeInfo();
        List<ChildAssetTypeInfo> childAssetTypeInfo2 = editableNodeInfo.getChildAssetTypeInfo();
        if (childAssetTypeInfo != null ? !childAssetTypeInfo.equals(childAssetTypeInfo2) : childAssetTypeInfo2 != null) {
            return false;
        }
        AssetProperties assetProperties = getAssetProperties();
        AssetProperties assetProperties2 = editableNodeInfo.getAssetProperties();
        if (assetProperties != null ? !assetProperties.equals(assetProperties2) : assetProperties2 != null) {
            return false;
        }
        List<GroupPermission> groupPermissions = getGroupPermissions();
        List<GroupPermission> groupPermissions2 = editableNodeInfo.getGroupPermissions();
        if (groupPermissions != null ? !groupPermissions.equals(groupPermissions2) : groupPermissions2 != null) {
            return false;
        }
        SubKindProperties subKindProperties = getSubKindProperties();
        SubKindProperties subKindProperties2 = editableNodeInfo.getSubKindProperties();
        if (subKindProperties != null ? !subKindProperties.equals(subKindProperties2) : subKindProperties2 != null) {
            return false;
        }
        String symbolicNodeHeroId = getSymbolicNodeHeroId();
        String symbolicNodeHeroId2 = editableNodeInfo.getSymbolicNodeHeroId();
        return symbolicNodeHeroId != null ? symbolicNodeHeroId.equals(symbolicNodeHeroId2) : symbolicNodeHeroId2 == null;
    }

    @Generated
    public List<String> getAccessRuleIds() {
        return this.accessRuleIds;
    }

    @Generated
    public AssetProperties getAssetProperties() {
        return this.assetProperties;
    }

    @Generated
    public List<ChildAssetTypeInfo> getChildAssetTypeInfo() {
        return this.childAssetTypeInfo;
    }

    @Generated
    public ClientProperties getClientProperties() {
        return this.clientProperties;
    }

    @Generated
    public CollectionProperties getCollectionProperties() {
        return this.collectionProperties;
    }

    @Generated
    public ContentProperties getContentProperties() {
        return this.contentProperties;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public String getFamilyId() {
        return this.familyId;
    }

    @Generated
    public List<GroupPermission> getGroupPermissions() {
        return this.groupPermissions;
    }

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public List<String> getKeywords() {
        return this.keywords;
    }

    @Generated
    public String getKind() {
        return this.kind;
    }

    @Generated
    public List<String> getLabels() {
        return this.labels;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public Map<String, List<String>> getParentMap() {
        return this.parentMap;
    }

    @Generated
    public List<String> getParents() {
        return this.parents;
    }

    @Generated
    public Map<String, Map<String, String>> getProperties() {
        return this.properties;
    }

    @Generated
    public Boolean getProtectedFolder() {
        return this.protectedFolder;
    }

    @Generated
    public Boolean getRestricted() {
        return this.restricted;
    }

    @Generated
    public Map<String, Map<String, String>> getSecondaryProperties() {
        return this.secondaryProperties;
    }

    @Generated
    public Settings getSettings() {
        return this.settings;
    }

    @Generated
    public String getSourceId() {
        return this.sourceId;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public SubKindProperties getSubKindProperties() {
        return this.subKindProperties;
    }

    @Generated
    public List<String> getSubKinds() {
        return this.subKinds;
    }

    @Generated
    public String getSymbolicNodeHeroId() {
        return this.symbolicNodeHeroId;
    }

    @Generated
    public List<String> getThings() {
        return this.things;
    }

    @Generated
    public List<String> getTransforms() {
        return this.transforms;
    }

    @Generated
    public Map<String, List<String>> getXAccntParentMap() {
        return this.xAccntParentMap;
    }

    @Generated
    public List<String> getXAccntParents() {
        return this.xAccntParents;
    }

    @Generated
    public int hashCode() {
        Boolean restricted = getRestricted();
        int hashCode = restricted == null ? 43 : restricted.hashCode();
        Boolean protectedFolder = getProtectedFolder();
        int hashCode2 = ((hashCode + 59) * 59) + (protectedFolder == null ? 43 : protectedFolder.hashCode());
        String id = getId();
        int hashCode3 = (hashCode2 * 59) + (id == null ? 43 : id.hashCode());
        String familyId = getFamilyId();
        int hashCode4 = (hashCode3 * 59) + (familyId == null ? 43 : familyId.hashCode());
        String name = getName();
        int hashCode5 = (hashCode4 * 59) + (name == null ? 43 : name.hashCode());
        String description = getDescription();
        int hashCode6 = (hashCode5 * 59) + (description == null ? 43 : description.hashCode());
        List<String> labels = getLabels();
        int hashCode7 = (hashCode6 * 59) + (labels == null ? 43 : labels.hashCode());
        String kind = getKind();
        int hashCode8 = (hashCode7 * 59) + (kind == null ? 43 : kind.hashCode());
        List<String> subKinds = getSubKinds();
        int hashCode9 = (hashCode8 * 59) + (subKinds == null ? 43 : subKinds.hashCode());
        List<String> parents = getParents();
        int hashCode10 = (hashCode9 * 59) + (parents == null ? 43 : parents.hashCode());
        List<String> xAccntParents = getXAccntParents();
        int hashCode11 = (hashCode10 * 59) + (xAccntParents == null ? 43 : xAccntParents.hashCode());
        Map<String, List<String>> parentMap = getParentMap();
        int hashCode12 = (hashCode11 * 59) + (parentMap == null ? 43 : parentMap.hashCode());
        Map<String, List<String>> xAccntParentMap = getXAccntParentMap();
        int hashCode13 = (hashCode12 * 59) + (xAccntParentMap == null ? 43 : xAccntParentMap.hashCode());
        Map<String, Map<String, String>> properties = getProperties();
        int hashCode14 = (hashCode13 * 59) + (properties == null ? 43 : properties.hashCode());
        Map<String, Map<String, String>> secondaryProperties = getSecondaryProperties();
        int hashCode15 = (hashCode14 * 59) + (secondaryProperties == null ? 43 : secondaryProperties.hashCode());
        ContentProperties contentProperties = getContentProperties();
        int hashCode16 = (hashCode15 * 59) + (contentProperties == null ? 43 : contentProperties.hashCode());
        String status = getStatus();
        int hashCode17 = (hashCode16 * 59) + (status == null ? 43 : status.hashCode());
        Settings settings = getSettings();
        int hashCode18 = (hashCode17 * 59) + (settings == null ? 43 : settings.hashCode());
        List<String> transforms = getTransforms();
        int hashCode19 = (hashCode18 * 59) + (transforms == null ? 43 : transforms.hashCode());
        CollectionProperties collectionProperties = getCollectionProperties();
        int hashCode20 = (hashCode19 * 59) + (collectionProperties == null ? 43 : collectionProperties.hashCode());
        String sourceId = getSourceId();
        int hashCode21 = (hashCode20 * 59) + (sourceId == null ? 43 : sourceId.hashCode());
        List<String> keywords = getKeywords();
        int hashCode22 = (hashCode21 * 59) + (keywords == null ? 43 : keywords.hashCode());
        ClientProperties clientProperties = getClientProperties();
        int hashCode23 = (hashCode22 * 59) + (clientProperties == null ? 43 : clientProperties.hashCode());
        List<String> things = getThings();
        int hashCode24 = (hashCode23 * 59) + (things == null ? 43 : things.hashCode());
        List<String> accessRuleIds = getAccessRuleIds();
        int hashCode25 = (hashCode24 * 59) + (accessRuleIds == null ? 43 : accessRuleIds.hashCode());
        List<ChildAssetTypeInfo> childAssetTypeInfo = getChildAssetTypeInfo();
        int hashCode26 = (hashCode25 * 59) + (childAssetTypeInfo == null ? 43 : childAssetTypeInfo.hashCode());
        AssetProperties assetProperties = getAssetProperties();
        int hashCode27 = (hashCode26 * 59) + (assetProperties == null ? 43 : assetProperties.hashCode());
        List<GroupPermission> groupPermissions = getGroupPermissions();
        int hashCode28 = (hashCode27 * 59) + (groupPermissions == null ? 43 : groupPermissions.hashCode());
        SubKindProperties subKindProperties = getSubKindProperties();
        int i = hashCode28 * 59;
        int hashCode29 = subKindProperties == null ? 43 : subKindProperties.hashCode();
        String symbolicNodeHeroId = getSymbolicNodeHeroId();
        return ((i + hashCode29) * 59) + (symbolicNodeHeroId != null ? symbolicNodeHeroId.hashCode() : 43);
    }

    @Generated
    public void setAccessRuleIds(List<String> list) {
        this.accessRuleIds = list;
    }

    @Generated
    public void setAssetProperties(AssetProperties assetProperties) {
        this.assetProperties = assetProperties;
    }

    @Generated
    public void setChildAssetTypeInfo(List<ChildAssetTypeInfo> list) {
        this.childAssetTypeInfo = list;
    }

    @Generated
    public void setClientProperties(ClientProperties clientProperties) {
        this.clientProperties = clientProperties;
    }

    @Generated
    public void setCollectionProperties(CollectionProperties collectionProperties) {
        this.collectionProperties = collectionProperties;
    }

    @Generated
    public void setContentProperties(ContentProperties contentProperties) {
        this.contentProperties = contentProperties;
    }

    @Generated
    public void setDescription(String str) {
        this.description = str;
    }

    @Generated
    public void setFamilyId(String str) {
        this.familyId = str;
    }

    @Generated
    public void setGroupPermissions(List<GroupPermission> list) {
        this.groupPermissions = list;
    }

    @Generated
    public void setId(String str) {
        this.id = str;
    }

    @Generated
    public void setKeywords(List<String> list) {
        this.keywords = list;
    }

    @Generated
    public void setKind(String str) {
        this.kind = str;
    }

    @Generated
    public void setLabels(List<String> list) {
        this.labels = list;
    }

    @Generated
    public void setName(String str) {
        this.name = str;
    }

    @Generated
    public void setParentMap(Map<String, List<String>> map) {
        this.parentMap = map;
    }

    @Generated
    public void setParents(List<String> list) {
        this.parents = list;
    }

    @Generated
    public void setProperties(Map<String, Map<String, String>> map) {
        this.properties = map;
    }

    @Generated
    public void setProtectedFolder(Boolean bool) {
        this.protectedFolder = bool;
    }

    @Generated
    public void setRestricted(Boolean bool) {
        this.restricted = bool;
    }

    @Generated
    public void setSecondaryProperties(Map<String, Map<String, String>> map) {
        this.secondaryProperties = map;
    }

    @Generated
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @Generated
    public void setSourceId(String str) {
        this.sourceId = str;
    }

    @Generated
    public void setStatus(String str) {
        this.status = str;
    }

    @Generated
    public void setSubKindProperties(SubKindProperties subKindProperties) {
        this.subKindProperties = subKindProperties;
    }

    @Generated
    public void setSubKinds(List<String> list) {
        this.subKinds = list;
    }

    @Generated
    public void setSymbolicNodeHeroId(String str) {
        this.symbolicNodeHeroId = str;
    }

    @Generated
    public void setThings(List<String> list) {
        this.things = list;
    }

    @Generated
    public void setTransforms(List<String> list) {
        this.transforms = list;
    }

    @Generated
    public void setXAccntParentMap(Map<String, List<String>> map) {
        this.xAccntParentMap = map;
    }

    @Generated
    public void setXAccntParents(List<String> list) {
        this.xAccntParents = list;
    }

    @Generated
    public String toString() {
        return "EditableNodeInfo(id=" + getId() + ", familyId=" + getFamilyId() + ", name=" + getName() + ", description=" + getDescription() + ", labels=" + getLabels() + ", kind=" + getKind() + ", subKinds=" + getSubKinds() + ", parents=" + getParents() + ", xAccntParents=" + getXAccntParents() + ", parentMap=" + getParentMap() + ", xAccntParentMap=" + getXAccntParentMap() + ", restricted=" + getRestricted() + ", protectedFolder=" + getProtectedFolder() + ", properties=" + getProperties() + ", secondaryProperties=" + getSecondaryProperties() + ", contentProperties=" + getContentProperties() + ", status=" + getStatus() + ", settings=" + getSettings() + ", transforms=" + getTransforms() + ", collectionProperties=" + getCollectionProperties() + ", sourceId=" + getSourceId() + ", keywords=" + getKeywords() + ", clientProperties=" + getClientProperties() + ", things=" + getThings() + ", accessRuleIds=" + getAccessRuleIds() + ", childAssetTypeInfo=" + getChildAssetTypeInfo() + ", assetProperties=" + getAssetProperties() + ", groupPermissions=" + getGroupPermissions() + ", subKindProperties=" + getSubKindProperties() + ", symbolicNodeHeroId=" + getSymbolicNodeHeroId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
