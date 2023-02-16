namespace SeniorSistemas.Mydomain.Myservice
{
    
    /// This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
    
    using System;
    using System.Collections;
    using System.Collections.Generic;
    			
    ///<summary>
    /// Output payload for command getDependencies
    ///</summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("sdl", "33.3.7")]
    public class GetDependenciesOutput
    {
        
        ///<summary>
        /// List with this service dependencies
        ///</summary>
        public IList<Dependency> Dependencies { get; set; }
        
        /// <summary>
        /// Constructor for GetDependenciesOutput
        /// </summary>
        /// <param name="dependencies">
        ///<summary>
        /// List with this service dependencies
        ///</summary>
        /// </param>
        public GetDependenciesOutput(IList<Dependency> dependencies)
        {
            this.Dependencies = dependencies;
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
