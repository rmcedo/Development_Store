namespace SeniorSistemas.Mydomain.Myservice
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.IO;
    using System.Reflection;

    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "33.3.7")]
    public class GetMetadataImpl : IGetMetadata
    {
    	public GetMetadataOutput GetMetadata(GetMetadataInput request)
    	{
        	string format = (String.IsNullOrEmpty(request.MetadataFormat)) ? "sd.xml" : request.MetadataFormat;
        	var resourceName = "metadata/my_service." + format;
        	using (Stream stream = Assembly.GetExecutingAssembly().GetManifestResourceStream(resourceName))
        	{
            	if (stream == null)
            	{
                	throw new FileNotFoundException(resourceName);
            	}
            	using (StreamReader reader = new StreamReader(stream))
            	{
                	return new GetMetadataOutput(reader.ReadToEnd());
            	}
        	}
    	}
    }
}
