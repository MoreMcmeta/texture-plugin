/*
 * MoreMcmeta is a Minecraft mod expanding texture configuration capabilities.
 * Copyright (C) 2023 soir20
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.moremcmeta.textureplugin;

import io.github.moremcmeta.moremcmeta.api.client.metadata.MetadataAnalyzer;
import io.github.moremcmeta.moremcmeta.api.client.texture.ComponentBuilder;
import io.github.moremcmeta.moremcmeta.api.client.texture.CurrentFrameView;
import io.github.moremcmeta.moremcmeta.api.client.texture.TextureComponent;

/**
 * Constants for both Fabric and Forge implementations of the plugin.
 * @author soir20
 */
public final class ModConstants {
    public static final String MOD_ID = "moremcmeta_texture_plugin";
    public static final String SECTION_NAME = "texture";
    public static final MetadataAnalyzer ANALYZER = new TextureMetadataAnalyzer();
    public static final ComponentBuilder COMPONENT_BUILDER = (metadata, frames) -> new TextureComponent<CurrentFrameView>() {};
}
