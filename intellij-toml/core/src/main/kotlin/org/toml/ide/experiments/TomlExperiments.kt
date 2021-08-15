/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.toml.ide.experiments

import com.intellij.openapi.util.registry.Registry

object TomlExperiments {
    private const val JSON_SCHEMA = "org.toml.json.schema"

    val isJsonSchemaEnabled
        get() = isFeatureEnabled(JSON_SCHEMA)

    @Suppress("SameParameterValue")
    private fun isFeatureEnabled(registryKey: String) =
        Registry.get(registryKey).asBoolean()
}
