package com.jobapp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobapp.model.Vacante;

@Controller
@RequestMapping
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {

		/*
		 * model.addAttribute("mensaje", "Bienvenido a Empleos App");
		 * model.addAttribute("fecha",new Date());
		 */
		String nombre = "Desarrollador Web";
		Date fechaPub = new Date();
		double salario = 3500000;
		boolean vigente = true;

		model.addAttribute("nombre", nombre);
		model.addAttribute("fechaPub", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);

		return "home";
	}

	@GetMapping("/listado")
	public String mostrarLista(Model model) {
		List<String> lista = new LinkedList<>();
		lista.add("Desarrollador Web");
		lista.add("Desarrollador Jr");
		lista.add("Desarrollador Senior");
		lista.add("Desarrollador Full Stack");
		model.addAttribute("empleos", lista);
		return "lista";
	}

	@GetMapping("/detalle")
	public String mostrarVacante(Model model) {

		Vacante vacante = new Vacante();
		vacante.setId(1L);
		vacante.setNombre("Desarrollador Full Stack");
		vacante.setDescripcion(
				"Encargado de manejar cada uno de los aspectos relacionados con la creación y el mantenimiento de una aplicación web. "
						+ "Para ello es fundamental que el desarrollador Full Stack tenga conocimientos en desarrollo Front-End y Back-End.");
		vacante.setSalario(3500000.0);
		vacante.setFecha(new Date());

		model.addAttribute("vacante", vacante);

		return "detalle";
	}

	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Vacante> vacantes = getVacantes();
		model.addAttribute("vacantes", vacantes);
		return "tabla";
	}

	public List<Vacante> getVacantes() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		List<Vacante> vacantes = new LinkedList<>();
		try {
			Vacante vacante1 = new Vacante();

			vacante1.setId(1L);
			vacante1.setImage("empresa1.png");
			vacante1.setNombre("Desarrollador Full Stack");
			vacante1.setDescripcion(
					"Encargado de manejar cada uno de los aspectos relacionados con la creación y el mantenimiento de una aplicación web. "
							+ "Para ello es fundamental que el desarrollador Full Stack tenga conocimientos en desarrollo Front-End y Back-End.");
			vacante1.setSalario(3500000.0);
			vacante1.setFecha(sdf.parse("11-09-2020"));
			vacante1.setDestacado(0);
			vacantes.add(vacante1);

			Vacante vacante2 = new Vacante();
			vacante2.setId(2L);
			vacante2.setImage("empresa2.png");
			vacante2.setNombre("Desarrolladores Backend");
			vacante2.setDescripcion("Ingenieros de sistemas, electrónica o afines.\r\n"
					+ "Experiencia de tres años en desarrollo de Software demostrable en implementación de aplicaciones modernas como:\r\n"
					+ "Tecnologías para la implementación de microservicios: Docker, Kubernetes, SpringBoot.\r\n"
					+ "Principios SOLID y DRY, patrones de diseño GoF y de microservicios y de buenas prácticas de desarrollo (TDD).\r\n"
					+ "Herramientas: DevOps, Jira, GitHub, Jenkins, Jfrog y Maven.\r\n"
					+ "Cloud Computing: Soluciones IaaS y PaaS en nubes públicas AWS y Azure.\r\n"
					+ "Lenguajes de programación JavaEE (Spring Framework) y/o nodeJs.\r\n"
					+ "Exposición y consumo de servicios web SOAP y de API RESTful con contratos Swagger (open API).\r\n"
					+ "Bases de datos relacionales y NoSQL.\r\n" + "Metodologías ágiles de desarrollo como SCRUM.");
			vacante2.setSalario(3500000.0);
			vacante2.setFecha(sdf.parse("27-09-2020"));
			vacante2.setDestacado(1);
			vacantes.add(vacante2);

			Vacante vacante3 = new Vacante();
			vacante3.setId(3L);
			vacante3.setImage("empresa3.png");
			vacante3.setNombre("Ingeniero Backend Java Sr.");
			vacante3.setDescripcion("Ingeniero de Sistemas, Informàtico o carreras afines.\r\n"
					+ "Mínimo de 5 a 8 años de experiencia como ingeniero de software. (Excluyente)\r\n"
					+ "Habilidades sólidas de comunicación verbal en inglés: Habilidad demostrada para explicar temas técnicos complejos a audiencias tanto técnicas como no técnicas. (Excluyente).\r\n"
					+ "Habilidades de comunicación escrita en inglés muy sólidas para poder redactar documentación técnica a un nivel de calidad que pueda ser presentada a las Autoridades Reguladoras.\r\n"
					+ "Sólida comprensión del proceso de diseño/arquitectura de programas informáticos.\r\n"
					+ "Experiencia en pruebas unitarias\r\n"
					+ "Experiencia con Desarrollo Ágil, SCRUM, y/o metodologías de Programación Extrema.\r\n"
					+ "Desarrollador de backend Java con fuerte conocimiento del lenguaje Java.\r\n"
					+ "Experiencia trabajando en un entornos como Amazon Web Services o Google Cloud Platform.\r\n"
					+ "Familiarizado con la tecnología Java Spring y SpringBoot. Familiaridad en la construcción de microservicios.\r\n"
					+ "Experiencia con herramientas como Github, Jenkins. Docker y Kubernetes es deseable.\r\n"
					+ "Experiencia en el desarrollo y la ampliación de APIs internas y en la escritura de código del lado del cliente que interactúe con otras APIs (RESTful).");
			vacante3.setSalario(4500000.0);
			vacante3.setFecha(sdf.parse("11-09-2020"));
			vacante3.setDestacado(1);
			vacantes.add(vacante3);

			Vacante vacante4 = new Vacante();
			vacante4.setId(4L);
			vacante4.setImage("empresa4.png");
			vacante4.setNombre("Desarrollador Backend Senior");
			vacante4.setDescripcion("Profesional de Sistemas o afines.\r\n" + "\r\n"
					+ "Experiencia laboral de más de 5 años de carrera general y 3 años como desarrollador Java, Spring Boot, SQL, GIT, TDD JUnit, DevOps (Pipelines CI,CD,RM), AWS específicamente los servicios: EKS, S3, RDS, Secretos, Docker, Filosofía Agile, Clean Architecture y Principios Solid.\r\n"
					+ "\r\n" + "Deseable conocimiento en Reactor.");
			vacante4.setSalario(6000000.0);
			vacante4.setFecha(sdf.parse("11-09-2020"));
			vacante4.setDestacado(0);
			vacantes.add(vacante4);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vacantes;
	}

}
