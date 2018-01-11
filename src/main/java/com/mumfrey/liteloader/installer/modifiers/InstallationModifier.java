package com.mumfrey.liteloader.installer.modifiers;

import java.util.List;
import java.util.Set;

import argo.jdom.JsonField;
import argo.jdom.JsonNode;

public interface InstallationModifier
{
    public abstract String getExclusivityKey();

    public abstract JsonNode modifyVersion(JsonNode versionJson);

    public abstract void modifyFields(List<JsonField> fields);

    public abstract void modifyJvmArgs(List<InstallationModifier> modifiers, Set<String> jvmArgs);
}
