package com.example.demo.controller;

import com.example.demo.model.Domicilio;
import com.example.demo.model.Educacion;
import com.example.demo.model.Experiencia_laboral;
import com.example.demo.model.Habilidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.model.Proyectos;
import com.example.demo.service.IDomicilioService;
import com.example.demo.service.IEducacionService;
import com.example.demo.service.IExperiencia_laboralService;
import com.example.demo.service.IHabilidadesService;
import com.example.demo.service.IPersonaService;
import com.example.demo.service.IProyectosService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class Controller {
	
	@Autowired
	private IPersonaService persoServ;
        
        @Autowired
        private IDomicilioService domiServ;
        
        @Autowired
        private IEducacionService eduServ;
        
        @Autowired
        private IExperiencia_laboralService exlServ;
        
        @Autowired
        private IHabilidadesService habServ;
         
        @Autowired
        private IProyectosService proyServ;
        
	@CrossOrigin
	@GetMapping("/hola/{nombre}")
	public String hola(@PathVariable String nombre) {
		return "hola " + nombre;

	}
	
        //crud persona
        
        @CrossOrigin
	@PostMapping("/altaPersona")
	public void altaPersona(@RequestBody Persona persona) {
		persoServ.addPersona(persona);

	}
	
	@CrossOrigin
        @DeleteMapping ("/delPersona/{id}")
	public void delPersona(@PathVariable Long id) {
		persoServ.delPersona(id);
	}
        
        @CrossOrigin
        @GetMapping("/getPersona/{id}")
	public Persona getPersona(@PathVariable Long id) {	
            return persoServ.getPersona(id);
	}
	
        @CrossOrigin
        @PostMapping("/updPersona")
	public void updPersona(@RequestBody Persona persona) {
		persoServ.updPersona(persona);
	}
        
        //crud domicilio
        
        @CrossOrigin
        @GetMapping("/getDomicilio/{id}")
        public Domicilio getDomicilio(@PathVariable Long id) {
            return domiServ.getDomicilio(id);
        }
	
        @CrossOrigin
        @PostMapping("/addDomicilio")
        public void addDomicilio(@RequestBody Domicilio domi){
            domiServ.addDomicilio(domi);
        }
        
        @CrossOrigin
        @DeleteMapping ("/delDomicilio/{id}")
	public void delDomicilio(@PathVariable Long id) {
		domiServ.delDomicilio(id);

	}
        
        //crud educacion
        
	@CrossOrigin
	@GetMapping("/listarEducacion")
        public List<Educacion> listarEducacion() {
            return eduServ.listarEducacion();
        }
        
        @CrossOrigin
        @GetMapping("/getEducacion/{id}")
        public Educacion getEducacion(@PathVariable Long id) {
            return eduServ.getEducacion(id);
        }
	
        @CrossOrigin
        @PostMapping("/addEducacion")
        public void addEducacion(@RequestBody Educacion edu){
            eduServ.addEducacion(edu);
        }
        
        @CrossOrigin
        @DeleteMapping ("/delEducacion/{id}")
	public void delEducacion(@PathVariable Long id) {
		eduServ.delEducacion(id);

	}
        
        //crud experiencia laboral
        
        @CrossOrigin
        @GetMapping("/listarExperiencia_laboral")
        public List<Experiencia_laboral> listarExperiencia_laboral() {
            return exlServ.listarExperiencia_laboral();
        }
        
        @CrossOrigin
        @GetMapping("/getExperiencia_laboral/{id}")
        public Experiencia_laboral getExperiencia_laboral(@PathVariable Long id) {
            return exlServ.getExperiencia_laboral(id);
        }
	
        @CrossOrigin
        @PostMapping("/addExperiencia_laboral")
        public void addExperiencia_laboral(@RequestBody Experiencia_laboral exl){
            exlServ.addExperiencia_laboral(exl);
        }
        
        @CrossOrigin
        @DeleteMapping ("/delExperiencia_laboral/{id}")
	public void delExperiencia_laboral(@PathVariable Long id) {
		exlServ.delExperiencia_laboral(id);

	}
        
        //crud habilidades
        
        @CrossOrigin
        @GetMapping("/listarHabilidades")
        public List<Habilidades> listarHabilidades() {
            return habServ.listarHabilidades();
        }
        
        @CrossOrigin
        @GetMapping("/getHabilidades/{id}")
        public Habilidades getHabilidades(@PathVariable Long id) {
            return habServ.getHabilidades(id);
        }
	
        @CrossOrigin
        @PostMapping("/addHabilidades")
        public void addHabilidades(@RequestBody Habilidades hab){
            habServ.addHabilidades(hab);
        }
        
        @CrossOrigin
        @DeleteMapping ("/delHabilidades/{id}")
	public void delHabilidades(@PathVariable Long id) {
		habServ.delHabilidades(id);

	}
        
        //crud proyectos
        
        @CrossOrigin
        @GetMapping("/listarProyectos")
        public List<Proyectos> listarProyectos() {
            return proyServ.listarProyectos();
        }
        
        @CrossOrigin
        @GetMapping("/getProyectos/{id}")
        public Proyectos getProyectos(@PathVariable Long id) {
            return proyServ.getProyectos(id);
        }
	
        @CrossOrigin
        @PostMapping("/addProyectos")
        public void addProyectos(@RequestBody Proyectos proy){
            proyServ.addProyectos(proy);
        }
        
        @CrossOrigin
        @DeleteMapping ("/delProyectos/{id}")
	public void delProyectos(@PathVariable Long id) {
		proyServ.delProyectos(id);

	}
}
