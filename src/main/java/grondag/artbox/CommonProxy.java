package grondag.artbox;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		ArtBox.setLog(event.getModLog());
	}

	public void init(FMLInitializationEvent event) 
	{
	    
	}

    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}