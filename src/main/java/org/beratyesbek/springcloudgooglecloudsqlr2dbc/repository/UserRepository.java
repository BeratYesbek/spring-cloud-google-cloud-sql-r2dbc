package org.beratyesbek.springcloudgooglecloudsqlr2dbc.repository;

import org.beratyesbek.springcloudgooglecloudsqlr2dbc.entity.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface UserRepository extends R2dbcRepository<User, Long> {
}
