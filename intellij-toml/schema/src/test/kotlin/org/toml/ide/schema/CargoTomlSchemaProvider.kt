/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.toml.ide.schema

/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

import com.intellij.openapi.vfs.VirtualFile
import com.jetbrains.jsonSchema.extension.JsonSchemaFileProvider
import com.jetbrains.jsonSchema.extension.JsonSchemaProviderFactory
import com.jetbrains.jsonSchema.extension.SchemaType

class CargoTomlSchemaProvider : JsonSchemaFileProvider {
    override fun isAvailable(file: VirtualFile): Boolean = true

    override fun getName(): String = "Cargo.toml schema"

    override fun getSchemaFile(): VirtualFile =
        JsonSchemaProviderFactory.getResourceFile(this::class.java, "/jsonSchemas/cargo-schema.json")

    override fun getSchemaType(): SchemaType = SchemaType.embeddedSchema
}
