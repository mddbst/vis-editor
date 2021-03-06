/*
 * Copyright 2014-2016 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotcrab.vis.editor.extension;

import com.badlogic.gdx.graphics.Texture;
import com.esotericsoftware.kryo.serializers.TaggedFieldSerializer.Tag;

/** @author Kotcrab */
public class DefaultExporterSettings {
	@Tag(0) public boolean skipDefaultValues = true;
	@Tag(1) public boolean useMinimalOutputType = true;
	@Tag(2) public boolean packageSeparateAtlasForEachScene = false;
	@Tag(3) public Texture.TextureFilter magTextureFilter = Texture.TextureFilter.Nearest;
	@Tag(4) public Texture.TextureFilter migTextureFilter = Texture.TextureFilter.Nearest;
}
