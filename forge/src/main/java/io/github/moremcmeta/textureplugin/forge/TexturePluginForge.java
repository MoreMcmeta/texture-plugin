package io.github.moremcmeta.textureplugin.forge;

import io.github.moremcmeta.moremcmeta.api.client.MoreMcmetaTexturePlugin;
import io.github.moremcmeta.moremcmeta.api.client.metadata.MetadataAnalyzer;
import io.github.moremcmeta.moremcmeta.api.client.texture.ComponentBuilder;
import io.github.moremcmeta.moremcmeta.forge.api.client.MoreMcmetaClientPlugin;
import io.github.moremcmeta.textureplugin.ModConstants;

/**
 * Implementation of the texture plugin on Forge.
 * @author soir20
 */
@SuppressWarnings("unused")
@MoreMcmetaClientPlugin
public class TexturePluginForge implements MoreMcmetaTexturePlugin {
    @Override
    public String sectionName() {
        return ModConstants.SECTION_NAME;
    }

    @Override
    public MetadataAnalyzer analyzer() {
        return ModConstants.ANALYZER;
    }

    @Override
    public ComponentBuilder componentBuilder() {
        return ModConstants.COMPONENT_BUILDER;
    }

    @Override
    public String id() {
        return ModConstants.MOD_ID;
    }
}
