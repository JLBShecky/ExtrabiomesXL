/**
 * This work is licensed under the Creative Commons
 * Attribution-ShareAlike 3.0 Unported License. To view a copy of this
 * license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */

package extrabiomes.core.handler;

import java.io.File;

import extrabiomes.core.utility.EnhancedConfiguration;


public class ExtrabiomesConfig extends EnhancedConfiguration {

    public static final String CATEGORY_MODULE_CONTROL = "module_control";

    public ExtrabiomesConfig(File file) {
        super(file);
    }
}