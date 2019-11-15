####Taken From https://tarunlalwani.com/post/mysql-master-slave-using-docker/ <br/>

Testing the setup: <br/>

$ docker-compose up -d <br/>
$ docker-compose logs -f mysqlconfigure <br/>
$ docker-compose exec mysqlmaster mysql -uroot -proot -e "CREATE DATABASE test_replication;" <br/>
$ docker-compose exec mysqlslave mysql -uroot -proot -e "SHOW DATABASES;" <br/>
