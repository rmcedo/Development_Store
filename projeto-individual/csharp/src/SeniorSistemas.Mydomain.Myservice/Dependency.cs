namespace SeniorSistemas.Mydomain.Myservice
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Represents a service dependency
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "33.3.7")]
    public class Dependency
    {
        
        ///<summary>
        /// Domain of the dependency service
        ///</summary>
        public string Domain { get; set; }
        
        ///<summary>
        /// Name of the dependency service
        ///</summary>
        public string Service { get; set; }
        
        ///<summary>
        /// Version of the dependency service
        ///</summary>
        public string Version { get; set; }
        
        /// <summary>
        /// Constructor for Dependency
        /// </summary>
        /// <param name="domain">
        ///<summary>
        /// Domain of the dependency service
        ///</summary>
        /// </param>
        /// <param name="service">
        ///<summary>
        /// Name of the dependency service
        ///</summary>
        /// </param>
        /// <param name="version">
        ///<summary>
        /// Version of the dependency service
        ///</summary>
        /// </param>
        public Dependency(string domain, string service, string version)
        {
            this.Domain = domain;
            this.Service = service;
            this.Version = version;
        }
        
        public virtual void Validate()
        {
        	Validate(new ArrayList());
        }
        
        internal virtual void Validate(IList validated)
        {
            MyServiceValidator.Validate(this, validated);
        }
    }
}
