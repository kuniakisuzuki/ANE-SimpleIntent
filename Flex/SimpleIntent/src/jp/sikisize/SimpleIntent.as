package jp.sikisize
{
	
	import flash.external.ExtensionContext;
	
	public class SimpleIntent
	{
		private var context:ExtensionContext;
		
		public function SimpleIntent()
		{
			context = ExtensionContext.createExtensionContext(
				"jp.sikisize.SimpleIntent", "type");
		}
		
		public function intent($packageName:String=""):void
		{
			if($packageName != ""){
				context.call("intent", $packageName);
			}
		}
		
		public function dispose() : void {
			return context.dispose();
		}
		
	}
}