####Taken From https://tarunlalwani.com/post/mysql-master-slave-using-docker/

Testing the setup:

$ docker-compose up -d
$ docker-compose logs -f mysqlconfigure
$ docker-compose exec mysqlmaster mysql -uroot -proot -e "CREATE DATABASE test_replication;"
$ docker-compose exec mysqlslave mysql -uroot -proot -e "SHOW DATABASES;"
