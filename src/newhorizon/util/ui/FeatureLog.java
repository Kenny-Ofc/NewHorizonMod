package newhorizon.util.ui;

import arc.func.Cons;
import arc.graphics.g2d.TextureRegion;
import arc.scene.ui.layout.Table;
import mindustry.ctype.UnlockableContent;

public class FeatureLog{
	public UnlockableContent content;
	
	public String title, description, type;
	public TextureRegion icon;
	
	public boolean important = false;
	public Cons<Table> modifier = null;
	
	public static final String
			ADJUST = "Adjustment",
			IMPROVE = "Improvement",
			BALANCE = "Balance",
			NEW_FEATURE = "Feature",
			FIXES = "Fix",
			IMPORTANT = "[gray]/[royal]Important Update";
			
	
	public FeatureLog(UnlockableContent content){
		title = content.localizedName;
		description = content.description;
		icon = content.fullIcon;
		type = content.getContentType().toString();
		
		this.content = content;
	}
	
	public FeatureLog(String title, String description, String type, TextureRegion icon){
		this.title = title;
		this.description = description;
		this.type = type;
		this.icon = icon;
	}
	
	public FeatureLog(String title, String description, String type, UnlockableContent content){
		this.content = content;
		this.title = title;
		this.description = description;
		this.type = type;
		this.icon = content.fullIcon;
	}
}
