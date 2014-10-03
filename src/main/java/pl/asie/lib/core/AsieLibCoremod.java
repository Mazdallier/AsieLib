package pl.asie.lib.core;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

import java.util.Map;

@MCVersion(value = "1.7.10")
public class AsieLibCoremod implements IFMLLoadingPlugin {
	@Override
	public String[] getASMTransformerClass() {
		return null;
	}

	@Override
	public String getModContainerClass() {
		return "pl.asie.lib.core.AsieLibCoremodContainer";
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
	}

	@Override
	public String getAccessTransformerClass() {
		return "pl.asie.lib.core.AsieLibCoremodTransformer";
	}
}