package no.ntnu.erbj.tds.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import no.ntnu.erbj.tds.model.Train;
import no.ntnu.erbj.tds.ui.cli.utilities.TdsLogger;

public class TrainDAO implements DAO<Train> {
  private static final TrainDAO instance = new TrainDAO();
  private final EntityManagerFactory emf;
  private final EntityManager em;

  /**
   * Constructor for the TrainDAO class.
   *
   * <p>Initializes the EntityManagerFactory and EntityManager.
   */
  private TrainDAO() {
    this.emf = Persistence.createEntityManagerFactory("tdsDB");
    this.em = this.emf.createEntityManager();
  }

  /**
   * Returns the instance of the TrainDAO class.
   *
   * @return the instance of the TrainDAO class
   */
  public static TrainDAO getInstance() {
    return instance;
  }

  /**
   * Adds a new instance of an entity to the database.
   *
   * @param train The entity to be added.
   */
  @Override
  public void add(Train train) {
    if (getInstance().getAll().contains(train)) {
      throw new IllegalArgumentException("Instance of train already exists in the database.");
    } else {
      this.em.getTransaction().begin();
      this.em.persist(train);
      this.em.getTransaction().commit();
    }
  }

  /**
   * Removes an instance of an entity from the database.
   *
   * @param train The entity to be removed.
   */
  @Override
  public void remove(Train train) {
    em.getTransaction().begin();
    em.remove(em.contains(train) ? train : em.merge(train));
    em.getTransaction().commit();
  }

  /**
   * Updates all fields of an entity in the database.
   *
   * @param train The entity to be updated.
   */
  @Override
  public void update(Train train) {
    em.getTransaction().begin();
    em.merge(train);
    em.flush();
    em.getTransaction().commit();
  }

  /**
   * Returns an iterator of all entity instances in the database.
   *
   * @return An iterator of all entities in the database.
   */
  @Override
  public Iterator<Train> iterator() {
    TypedQuery<Train> query = this.em.createQuery("SELECT a FROM Train a", Train.class);
    return query.getResultList().iterator();
  }

  /**
   * Finds a specific entity instance by using the entity's id.
   *
   * @param id The id as a String.
   * @return The entity instance found.
   */
  @Override
  public Optional<Train> find(Long id) {
    return Optional.ofNullable(em.find(Train.class, id));
  }

  /**
   * Returns a List of all entity instances in the database.
   *
   * @return All entity instances in the database as a List.
   */
  @Override
  public List<Train> getAll() {
    return em.createQuery("SELECT a FROM Train a", Train.class).getResultList();
  }

  /** Prints entity-specific details of all the entity instances in the database. */
  @Override
  public void printAllDetails() {
    List<Train> trainList = getAll();
    for (Train train : trainList) {
      TdsLogger.getInstance()
          .info("Train Details" + " :: " + train.getId());
    }
  }

  /** Closes the EntityManagerFactory and the EntityManager. */
  @Override
  public void close() {
    if (em.isOpen()) {
      this.em.close();
    }
    if (emf.isOpen()) {
      this.emf.close();
    }
  }
}