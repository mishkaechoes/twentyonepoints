package or.jhipster.health.repository.search

import or.jhipster.health.domain.User
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
interface UserSearchRepository : ElasticsearchRepository<User, Long>
