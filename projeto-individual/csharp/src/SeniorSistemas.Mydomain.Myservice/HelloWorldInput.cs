namespace SeniorSistemas.Mydomain.Myservice
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Input payload for command helloWorld
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "33.3.7")]
    public class HelloWorldInput
    {
        
        ///<summary>
        /// TBD
        ///</summary>
        public string Who { get; set; }
        
        /// <summary>
        /// Constructor for HelloWorldInput
        /// </summary>
        /// <param name="who">
        ///<summary>
        /// TBD
        ///</summary>
        /// </param>
        public HelloWorldInput(string who)
        {
            this.Who = who;
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
