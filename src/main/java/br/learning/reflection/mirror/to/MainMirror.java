package br.learning.reflection.mirror.to;

import java.lang.reflect.Field;

import net.vidageek.mirror.dsl.Mirror;
import net.vidageek.mirror.list.dsl.MirrorList;

public class MainMirror {
	public static void main(String[] args) {
		pureReflection();
		mirrorReflection();
	}

	private static void pureReflection() {
		System.out.println("Listando campos com reflection");
		Class<MasterUserTO> clazz = MasterUserTO.class;
		Field[] fields = clazz.getFields();
		for (int i = 0; i < fields.length; i++) {
			// Nao sai nada no console pois o metodo getFields retorna apenas campos acessiveis e com
			// modificador public.
			System.out.println(fields[i]);
		}
		
		Field[] fields2 = clazz.getDeclaredFields();
		for (int i = 0; i < fields2.length; i++) {
			// Nao lista os atributos herdados pela classe.
			System.out.println(fields2[i]);
		}
		
		Field[] fields3 = clazz.getSuperclass().getDeclaredFields();
		for (int i = 0; i < fields3.length; i++) {
			// lista os atributos da classe pai... Se houvesse uma hierarquia maior, seria necessario ir percorrendo
			// todas as classes pai para verificar todos os atributos.
			System.out.println(fields3[i]);
		}
		
	}

	private static void mirrorReflection() {
		System.out.println("\n\nListando campos com Mirror");
		Class<MasterUserTO> clazz = MasterUserTO.class;
		MirrorList<Field> fields = new Mirror().on(clazz).reflectAll().fields();
		for (int i = 0; i < fields.size(); i++) {
			// Lista todos os atributos da classe mesmo estando com modificador private e os atributos herdados
			System.out.println(fields.get(i));
		}
	}
}
