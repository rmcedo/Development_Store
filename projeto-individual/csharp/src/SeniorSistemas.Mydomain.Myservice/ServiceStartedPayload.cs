namespace SeniorSistemas.Mydomain.Myservice
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Payload for ServiceStartedPayload
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "33.3.7")]
    public class ServiceStartedPayload
    {
        
        ///<summary>
        /// TBD
        ///</summary>
        public string Domain { get; set; }
        
        ///<summary>
        /// TBD
        ///</summary>
        public string Service { get; set; }
        
        /// <summary>
        /// Constructor for ServiceStartedPayload
        /// </summary>
        /// <param name="domain">
        ///<summary>
        /// TBD
        ///</summary>
        /// </param>
        /// <param name="service">
        ///<summary>
        /// TBD
        ///</summary>
        /// </param>
        public ServiceStartedPayload(string domain, string service)
        {
            this.Domain = domain;
            this.Service = service;
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
