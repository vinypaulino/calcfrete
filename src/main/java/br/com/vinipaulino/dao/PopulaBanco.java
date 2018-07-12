package br.com.vinipaulino.dao;

import javax.persistence.EntityManager;

import br.com.vinipaulino.modelo.Veiculo;

public class PopulaBanco {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		try {
			em.getTransaction().begin();

			Veiculo v1 = geraVeiculo("Caminhao Bau", 1.0);
			em.persist(v1);

			Veiculo v2 = geraVeiculo("Caminhao Cacamba", 1.05);
			em.persist(v2);

			Veiculo v3 = geraVeiculo("Carreta", 1.12);
			em.persist(v3);

			em.getTransaction().commit();

		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("INSERT: " + e.getMessage());
		} finally {
			em.close();
		}
	}

	private static Veiculo geraVeiculo(String tipoVeiculo, Double fatorValor) {
		Veiculo veiculo = new Veiculo();
		veiculo.setTipoVeiculo(tipoVeiculo);
		veiculo.setFatorValor(fatorValor);
		return veiculo;
	}

}
