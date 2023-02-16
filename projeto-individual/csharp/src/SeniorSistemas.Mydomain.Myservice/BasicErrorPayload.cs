namespace SeniorSistemas.Mydomain.Myservice
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Default error payload type. Every service defines its own.
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "33.3.7")]
    public class BasicErrorPayload
    {
        
        ///<summary>
        /// The user-facing error message, if any.
        ///</summary>
        public string Message { get; set; }
        
        ///<summary>
        /// The program-accessible (and service-specific) error code.
        ///</summary>
        public string ErrorCode { get; set; }
        
        /// <summary>
        /// Constructor for BasicErrorPayload
        /// </summary>
        public BasicErrorPayload()
        {
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
