package io.github.moremcmeta.textureplugin;

import io.github.moremcmeta.moremcmeta.api.client.metadata.MetadataAnalyzer;
import io.github.moremcmeta.moremcmeta.api.client.texture.ComponentBuilder;
import io.github.moremcmeta.moremcmeta.api.client.texture.TextureComponent;

/**
 * Constants for both Fabric and Forge implementations of the plugin.
 * @author soir20
 */
public class ModConstants {
    public static final String MOD_ID = "moremcmeta_texture_plugin";
    public static final String SECTION_NAME = "texture";
    public static final MetadataAnalyzer ANALYZER = new TextureMetadataAnalyzer();
    public static final ComponentBuilder COMPONENT_BUILDER = ((metadata, frames) -> new TextureComponent<>() {});
}
