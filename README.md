
---

# RedisModule

This project demonstrates **clear Redis configuration and implementation** using Java / Spring Boot.
It also documents the **complete setup process** of Redis using **WSL + Ubuntu** on a Windows machine.

---

## 📌 Objective

* Understand **where Redis comes from**
* Install Redis locally using **WSL (Ubuntu)**
* Verify Redis is running
* Connect Redis with a **Java / Spring Boot application**
* Keep this document as a **future reference**

---

## 🧩 Problem Faced Initially

I was confused about:

* Where to get the Redis database from
* How to run Redis on a Windows machine
* How to verify Redis is running
* How to connect Redis with Java/Spring Boot

---

## ✅ Solution Approach

I solved this by:

1. Installing **WSL**
2. Installing **Ubuntu**
3. Installing **Redis inside Ubuntu**
4. Verifying Redis status
5. Connecting Redis with Java/Spring Boot

---

## 🛠 Step-by-Step Implementation

---

## STEP 1: Install WSL on Windows

Open **Command Prompt (Run as Administrator)** and run:

```bash
wsl --install
```

✔ This installs:

* WSL
* Default Linux distribution (Ubuntu)

➡ Restart your system after installation.

---

## STEP 2: Verify WSL Installation

```bash
wsl --status
```

Expected output:

* Default Distribution: Ubuntu
* Default Version: 2

---

## STEP 3: Open Ubuntu (WSL)

From Start Menu:

```
Ubuntu
```

or from terminal:

```bash
wsl
```

---

## STEP 4: Update Ubuntu Packages

```bash
sudo apt update
sudo apt upgrade -y
```

---

## STEP 5: Install Redis Server

```bash
sudo apt install redis-server -y
```

---

## STEP 6: Start Redis Server

```bash
sudo service redis-server start
```

---

## STEP 7: Check Redis Status

```bash
sudo service redis-server status
```

Expected:

```
Active: active (running)
```

---

## STEP 8: Verify Redis Is Listening (Ping Test)

Open Redis CLI:

```bash
redis-cli
```

Ping Redis:

```bash
ping
```

Expected response:

```
PONG
```

✔ This confirms Redis is running and listening.

---

## STEP 9: Test Redis Commands Manually

```bash
set testKey "Redis Working"
get testKey
```

Output:

```
"Redis Working"
```

---

## 🔗 Redis Configuration in Spring Boot

### `application.properties`

```properties
spring.redis.host=localhost
spring.redis.port=6379
spring.redis.timeout=60000
```

> Redis runs inside WSL but is accessible via `localhost` from Windows.

---

## 📦 Maven Dependency

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>

<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
    <version>5.1.0</version>
</dependency>
```

---

## 🧪 Java Redis Test Example

```java
Jedis jedis = new Jedis("localhost", 6379);
jedis.set("user:name", "Prajjwal Sharma");
System.out.println(jedis.get("user:name"));
jedis.close();
```

---

## ⚠ Important Notes

* `application.properties` is used **only by Spring**
* Plain Java `main()` does **not** auto-read properties
* Redis must be **running before starting the application**
* Always verify Redis using `redis-cli ping`

---

## 🧠 Key Learnings

* Redis is an **in-memory data store**
* WSL is the best way to run Redis on Windows
* Redis can be used for:

  * Cache
  * Queue
  * Pub/Sub
  * Session storage

---

## 🚀 Next Enhancements (Optional)

* Redis Cache using `@Cacheable`
* Redis as Queue
* Redis Pub/Sub
* RedisTemplate vs Jedis
* Redis vs In-memory Java Queue


